package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class SudokuSolver {
	
	static char[][] sudoku = {{'1',' ',' ',' '}
	,{' ','4','2',' '},
	{'2',' ',' ',' '},
	{'4',' ',' ',' '}};
	
	static List<List<String>> solvedSudoku = new ArrayList<>();
	
	static void helper(char[][] sudoku) {
		
		
	}
	
	static boolean isSafe(char[][] sudoku, char val, int row, int col) {
		//horizontal check
		for(int j=col; j<sudoku.length;++j ) {
			if(sudoku[row][j]==val) {
				return false;
			}
		}
		
		//vertical check
		for(int i=row; i<sudoku.length;++i) {
			if(sudoku[i][col]==val) {
				return false;
			}
		}
		
		// grid check
		
		return true;
	}
	
	public static void main(String[] args) {
		
	}

}
