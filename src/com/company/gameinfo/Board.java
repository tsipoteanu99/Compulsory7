package com.company.gameinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * In clasa board am creat o lista de tokens si cand ii setez acestia vor lua 3 "jokeri" (tokenuri blank) random, cu ajutorul clasei Random asa cum am facut in metoda setTokens
 * **/
public class Board {
    private List<Token> tokens = new ArrayList<>();
    private int limit;

    public Board(int limit) {
        this.limit = limit;
        this.setTokens();
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public void setTokens() {
        Random random= new Random();
        int joker1=random.nextInt(limit);
        int joker2=random.nextInt(limit);
        int joker3=random.nextInt(limit);
        for(int i=0; i<limit;i++){
            tokens.add(new Token(i));
            if(i!=joker1 && i!=joker2 && i!=joker3)
                tokens.get(i).setJoker(true);
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Board{" +
                "tokens=" + tokens +

                '}';
    }
}
