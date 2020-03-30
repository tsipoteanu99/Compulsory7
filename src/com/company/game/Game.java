package com.company.game;

import com.company.entity.Player;
import com.company.gameinfo.Board;

/**Aceasta clasa va extinde Thread deoarece instanta acestei clase va folosi obiecte Runnable executate prin threaduri
 * **/

public class Game extends Thread {
    Board board;

        public Game(int boardSize){
            this.board=new Board(boardSize);
            Runnable player1= new Player("Anton", this.board);
            Runnable player2= new Player("Alex", this.board);
            Runnable player3= new Player("Geani", this.board);
            Runnable player4= new Player("Ancuta", this.board);

            System.out.println(board);

            new Thread(player1).start();
            try{
                Thread.sleep(8);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            new Thread(player2).start();
            try{
                Thread.sleep(8);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            new Thread(player3).start();
            try{
                Thread.sleep(8);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            new Thread(player4).start();
            try{
                Thread.sleep(8);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(board);
            System.out.println(player1);
            System.out.println(player2);
            System.out.println(player3);
            System.out.println(player4);


        }


}
