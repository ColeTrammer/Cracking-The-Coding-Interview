package com.deepak.ctci.Ch01_Arrays_And_Strings;

import java.util.HashMap;

public class Problem_02 {

	public static boolean isValidPermutation(String string, String string2) {
		if (string.length() != string2.length()) { return false; }
		
		HashMap<Character, Integer> count = new HashMap<>();
		for (int i = 0; i < string.length(); i++) {
			if (count.containsKey(string.charAt(i))) {
				count.put(string.charAt(i), count.get(string.charAt(i)) + 1);
			} else {
				count.put(string.charAt(i), 1);
			}
		}
		
		for (int i = 0; i < string2.length(); i++) {
			if (!count.containsKey(string2.charAt(i))) {
				return false;
			}
			count.put(string2.charAt(i), count.get(string2.charAt(i)) - 1);
			if (count.get(string2.charAt(i)) < 0) {
				return false;
			}
		}
		
		return true;
	}

}
