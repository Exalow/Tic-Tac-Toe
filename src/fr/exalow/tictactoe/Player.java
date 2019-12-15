package fr.exalow.tictactoe;

public class Player {

    private String name;
    private char mark;

    public Player(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public Character getMark() {
        return mark;
    }
}
