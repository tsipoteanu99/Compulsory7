package com.company.gameinfo;


/**
 * Clasa token are ca argumente valoarea tokenului, un boolean care va decide daca acesta este joker(blank) sau nu si o variabila boolean care va retine daca tokenul a fost sau nu extras
 * **/

public class Token {
    private int value;
    private boolean joker;
    private boolean extracted;

    public Token(int value){
        this.value=value;
        this.extracted=false;
    }

    public boolean isExtracted() {
        return extracted;
    }

    public void setExtracted(boolean extracted) {
        this.extracted = extracted;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isJoker() {
        return joker;
    }

    public void setJoker(boolean joker) {
        this.joker = joker;
    }

    @Override
    public String toString() {
        return "Token{"+ value +
                '}';
    }
}
