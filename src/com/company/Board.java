package com.company;

/**
 * Created by brian on 6/14/17.
 */
public class Board {
	int[][] gameBoard;

	Board() {
		this.gameBoard = new int[3][3];
	}

	int[][] getGameBoard() {
		return this.gameBoard;
	}

	void printGameBoard() {
		for(int i = 0; i < this.gameBoard.length; i++ ) {
			System.out.println("\n");
			for(int j = 0; j < this.gameBoard.length; j++ ) {
				System.out.print(this.gameBoard[i][j]);
				System.out.print(" ");
			}
		}
	}
}
