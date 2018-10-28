package com.deepak.ctci.Ch01_Arrays_And_Strings;

import java.util.HashSet;

public class Problem_08 {

	public static int[][] setZeros(int[][] matrix) {
		HashSet<Integer> rows = new HashSet<>();
		HashSet<Integer> cols = new HashSet<>();
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[r].length; c++) {
				if (matrix[r][c] == 0) {
					rows.add(r);
					cols.add(c);
				}
			}
		}
		for (int r : rows) {
			for (int c = 0; c < matrix[r].length; c++) {
				matrix[r][c] = 0;
			}
		}
		for (int c : cols) {
			for (int r = 0; r < matrix.length; r++) {
				matrix[r][c] = 0;
			}
		}
		return matrix;
	}

}
