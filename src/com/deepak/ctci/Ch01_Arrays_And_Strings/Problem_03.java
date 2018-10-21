package com.deepak.ctci.Ch01_Arrays_And_Strings;

public class Problem_03 {

	public static String replaceSpacesWithSpecialCharacter(String string, int j) {
		if (string == null || string.length() == 0) { return null; }
		
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < string.length() && i < j; i++) {
			if (string.charAt(i) == ' ') {
				ans.append("%20");
			} else {
				ans.append(string.charAt(i));
			}
		}
		return ans.toString();
	}

}
