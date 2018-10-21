package com.deepak.ctci.Ch01_Arrays_And_Strings;

import java.util.HashMap;

public class Problem_04 {

	public static boolean isPalindromePermutation(String string) {
		if (string == null) { return false; }
		
		string = string.toLowerCase();
		
		HashMap<Character, Integer> count = new HashMap<>();
		for (int i = 0; i < string.length(); i++) {
			if (!Character.isSpaceChar(string.charAt(i))) {
				if (count.containsKey(string.charAt(i))) {
					count.put(string.charAt(i), count.get(string.charAt(i)) + 1);
				} else {
					count.put(string.charAt(i), 1);
				}
			}
		}
		
		boolean oneOddNum = false;
		for (int value : count.values()) {
			if (value % 2 == 1) {
				if (oneOddNum) {
					return false;
				} else {
					oneOddNum = true;
				}
			}
		}
		return true;
	}

}
