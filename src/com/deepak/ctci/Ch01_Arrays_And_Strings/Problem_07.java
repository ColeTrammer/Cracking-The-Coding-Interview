package com.deepak.ctci.Ch01_Arrays_And_Strings;

public class Problem_07 {

	public static int[][] rotateMatrix(int[][] matrix) {
		int[][] ans = new int[matrix.length][matrix[0].length];
		for (int r = 0; r < ans.length; r++) {
			for (int c = 0; c < ans[r].length; c++) {
				ans[c][ans[0].length - 1 - r] = matrix[r][c];
			}
		}
		return ans;
	}

}
