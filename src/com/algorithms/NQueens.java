package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

	static List<List<String>> allboards = new ArrayList<>();
	static char[][] board = new char[5][5];

	static void solveNQueens(char[][] board, List<List<String>> allboards, int col) {
		if (col == board.length) {
			saveBoard(board, allboards);
			return;
		}
		for (int row = 0; row < board.length; ++row) {
			if (isSafe(row, col, board)) {
				board[row][col] = 'Q';
				solveNQueens(board, allboards, col + 1);
				board[row][col] = 'x';
			}
		}
	}

	static void saveBoard(char[][] board, List<List<String>> allboards) {
		// TODO Auto-generated method stub
		List<String> newBoard = new ArrayList<>();
		for (int i = 0; i < board.length; ++i) {
			StringBuilder row = new StringBuilder();
			for (int j = 0; j < board.length; ++j) {
				if (board[i][j] == 'Q') {
					row.append("Q");
				} else {
					row.append("x");
				}
			}
			newBoard.add(row.toString());
		}
		allboards.add(newBoard);
	}

	static boolean isSafe(int row, int col, char[][] board) {
		// horizontal
		for (int i = 0; i < board.length; ++i) {
			if (board[row][i] == 'Q') {
				return false;
			}
		}

		// vertical
		for (int i = 0; i < board[0].length; ++i) {
			if (board[i][col] == 'Q') {
				return false;
			}
		}
		// upper left diagonal; row-1, col-1
		for (int r = row, c = col; c >= 0 && r >= 0; --c, --r) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}

		// upper right diagonal; row-1, col+1
		for (int r = row, c = col; c < board[0].length && r >= 0; ++c, --r) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}

		// lower left diagonal; row+1, col-1
		for (int r = row, c = col; c >= 0 && r < board.length; --c, ++r) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}

		// lower right diagonal; row+1, col+1
		for (int r = row, c = col; c < board[0].length && r < board.length; ++c, ++r) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		solveNQueens(board, allboards, 0);
		allboards.stream().forEach(System.out::println);
	}
}
