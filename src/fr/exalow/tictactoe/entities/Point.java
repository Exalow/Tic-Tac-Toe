package fr.exalow.tictactoe.entities;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            if (((Point) obj).getX() == x && ((Point) obj).getY() == y){
                return true;
            }
        }
        return false;
    }
}