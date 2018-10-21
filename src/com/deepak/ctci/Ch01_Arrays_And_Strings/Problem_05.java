package com.deepak.ctci.Ch01_Arrays_And_Strings;

public class Problem_05 {

	public static boolean isOneEditAway(String string, String string2) {
		int errors = 0;
		for (int i = 0; i < string2.length(); i++) {
			if (string.charAt(i) != string2.charAt(i)) {
				errors++;
			}
		}
		
		errors += Math.abs(string.length() - string2.length());
		
		return errors == 1;
	}

}
