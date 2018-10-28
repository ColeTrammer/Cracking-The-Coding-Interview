package com.deepak.ctci.Ch01_Arrays_And_Strings;

public class Problem_09 {

	public static boolean isRotation(String string, String string2) {
		if (string == null || string2 == null) { return false; }
		for (int i = 0; i < string.length(); i++) {
			if ((string2.substring(i) + string2.substring(0, i)).equals(string)) {
				return true;
			}
		}
		return false;
	}

}
