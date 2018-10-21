package com.deepak.ctci.Ch01_Arrays_And_Strings;

public class Problem_06 {

	public static String compressString(String string) {
		if (string == null || string.isEmpty()) { return string; }
		
		String compressed = "";
		int tempCount = 1;
		char prevLetter = string.charAt(0);
		for (int i = 1; i < string.length(); i++) {
			if (string.charAt(i) == prevLetter) {
				tempCount++;
			} else {
				compressed += "" + prevLetter + tempCount;
				prevLetter = string.charAt(i);
				tempCount = 1;
			}
		}
		compressed += "" + prevLetter + tempCount;
		
		return compressed.length() < string.length() ? compressed : string;
	}

}
