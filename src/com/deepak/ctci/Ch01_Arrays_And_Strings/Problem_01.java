package com.deepak.ctci.Ch01_Arrays_And_Strings;

public class Problem_01 {

	public static boolean hasUniqueAscii(String string) {
		if (string == null) { return false; }
		
		boolean[] found = new boolean[256];
		for (int i = 0; i < string.length(); i++) {
			if (found[string.charAt(i)]) {
				return false;
			}
			found[string.charAt(i)] = true;
		}
		return true;
	}

}
