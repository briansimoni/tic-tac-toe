package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Board board = new Board();
        board.playerMove(0,0, 'x');
        board.playerMove(1,1,'o');
        board.printGameBoard();
    }
}
