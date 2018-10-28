package com.deepak.ctci.Ch01_Arrays_And_Strings;

public class Problem_05 {

	public static boolean isOneEditAway(String string, String string2) {
		if (Math.abs(string.length() - string2.length()) > 1) {
			return false;
		}
		boolean changed = false;
		for (int i = 0; i < string.length(); i++) {
			if (i >= string.length() || i >= string2.length() || string.charAt(i) != string2.charAt(i)) {
				if (changed) { return false; }
				changed = true;
				if (i < string.length() - 1 && string.charAt(i + 1) == string2.charAt(i)) {
					string = string.substring(i + 1);
					string2 = string2.substring(i);
					i = -1;
				} else if (i < string2.length() - 1 && string2.charAt(i + 1) == string.charAt(i)) {
					string = string.substring(i);
					string2 = string2.substring(i + 1);
					i = -1;
				}
			}
		}
		return true;
	}

}
