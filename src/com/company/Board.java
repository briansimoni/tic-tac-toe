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
	}

	int minimax(boolean isMaximizingPlayer) {
		if(this.gameIsOver()) {
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
