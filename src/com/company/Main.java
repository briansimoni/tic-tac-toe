package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner reader = new Scanner(System.in);
        System.out.println("Who goes first? [ME] | [AI]");
        String goesFirst = reader.nextLine().toUpperCase();
        if (goesFirst.equals("ME")){
            System.out.println("Okay, you go first");
        } else if (goesFirst.equals("AI")) {
            System.out.println("AI goes first");
        } else {
            System.out.println("You suck and typed in the wrong thing, you lose!");
        }



        Board board = new Board();
        boolean isGameOver = true;
        while(isGameOver){
           System.out.println("\nPlease input your coordinates to play: [(x , y)]");
           String coordinate = reader.nextLine();
            if (coordinate.equals("STOP")) {
                isGameOver = false;
            }
           String[] parts = coordinate.split(",");
           int x = Integer.parseInt(parts[0].trim().substring(1).trim());
           int y = Integer.parseInt(parts[1].trim().substring(0, parts[1].trim().length() - 1).trim());
            board.playerMove(x,y, 'x');

        }

        board.playerMove(1,1,'o');



    }
}
