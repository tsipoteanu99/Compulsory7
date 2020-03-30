package com.company.entity;

import com.company.exceptions.IllegalTokenExtraction;
import com.company.gameinfo.Board;
import com.company.gameinfo.Token;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clasa Player implementeaza clasa Runnable deoarece vrem sa executam instantele obiectelor de tip Player cu ajutorul threadurilor, asadar va trebui si sa facem override la metoda run()
 * **/

public class Player implements Runnable {
    private String name;
    private Board board;
    private List<Token> extractedTokens = new ArrayList<>();

    public Player(String name, Board board){
        this.name=name;
        this.board=board;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Token> getExtractedTokens() {
        return extractedTokens;
    }

    public void setExtractedTokens(List<Token> extractedTokens) {
        this.extractedTokens = extractedTokens;
    }

    public void extractToken(Board board) {
        int ok=0;
        while(ok==0){
            Random number = new Random();
            int index= number.nextInt(board.getLimit());
            if(!board.getTokens().get(index).isExtracted()){
                ok=1;
                extractedTokens.add(board.getTokens().get(index));
                board.getTokens().get(index).setExtracted(true);
            }

        }
    }



    @Override
    public void run() {
       synchronized (this){
           for(int i=0; i<board.getLimit();i++)
           this.extractToken(board);
       }
    }

    @Override
    public String toString() {
        return  "name='" + name +
                ", extractedTokens=" + extractedTokens +
                '}';
    }
}
