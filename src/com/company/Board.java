package com.company;

/**
 * Created by brian on 6/14/17.
 */
public class Board {
	char[][] gameBoard;

	Board() {
		this.gameBoard = new char[3][3];
		for(int i = 0; i < this.gameBoard.length; i++ ) {
			for(int j = 0; j < this.gameBoard.length; j++ ) {
				this.gameBoard[i][j] = '_';
			}
		}
	}

	char[][] getGameBoard() {
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

	void playerMove(int x, int y, char player) {
		this.gameBoard[x][y] = player;
	}
}
