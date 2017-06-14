package com.company;

/**
 * Created by brian on 6/14/17.
 */
public class Board {
	private char[][] gameBoard;
	private int bestVal = 0;
	private int value = 0;
	private final int INFINITY = 99999;

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
		this.printGameBoard();
		if(this.checkForWin()) {
			System.out.print("win");
		} else {
			System.out.print("no win");
		}
	}

	Boolean checkForWin() {
		for (int i = 0; i < this.gameBoard.length; i++) {
			if(this.gameBoard[i][0] == this.gameBoard[i][1] && this.gameBoard[i][1] == this.gameBoard[i][2]) {
				if(this.gameBoard[i][0] != '_') {
					return true;
				}
			}
		}
		for (int j = 0; j < this.gameBoard.length; j++) {
			if(this.gameBoard[0][j] == this.gameBoard[1][j] && this.gameBoard[1][j] == this.gameBoard[2][j]) {
				if(this.gameBoard[0][j] != '_') {
					return true;
				}
			}
		}
		if(this.gameBoard[0][0] == this.gameBoard[1][1] && this.gameBoard[1][1] == this.gameBoard[2][2]) {
			if(this.gameBoard[0][0] != '_') {
				return true;
			}
		}
		if(this.gameBoard[0][2] == this.gameBoard[1][1] && this.gameBoard[1][1] == this.gameBoard[2][0]) {
			if(this.gameBoard[0][2] != '_') {
				return true;
			}
		}
		return false;
	}

	// not working yet
	int minimax(boolean isMaximizingPlayer) {
		if(this.checkForWin() == true) {
			return 1;
		}

		if(isMaximizingPlayer) {
			bestVal -= INFINITY;
			for(int i = 0; i < 100; i++ ) {
				// refactor to for each move in board
				value = minimax( false);
				bestVal = max(bestVal, value);
				return bestVal;
			}
		} else {
			bestVal += INFINITY;
			for(int i = 0; i < 100; i++ ) {
				// refactor to for each move in board
				value = minimax( false);
				bestVal = min(bestVal, value);
				return bestVal;
			}
		}
		return 0;
	}

	boolean gameIsOver() {
		return false;
	}

	private int max(int a, int b) {
		return a >= b ? a : b;
	}

	private int min(int a, int b) {
		return a > b ? b : a;
	}
}
