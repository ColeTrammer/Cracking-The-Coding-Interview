/**
 * Cracking-The-Coding-Interview
 * Problem_01_Test.java
 */
package com.deepak.ctci.Ch01_Arrays_And_Strings;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Ch01_Arrays_And_Strings.Problem_01;

/**
 * Test cases for Problem 01
 * 
 * @author Deepak
 */
public class Problem_01_Test {

	/**
	 * Test case to check the uniqueness of Ascii strings
	 */
	@Test
	public void testUniqueCharactersForAsciiString() {
		Assert.assertFalse(Problem_01.hasUniqueAscii("Deepak"));
		Assert.assertTrue(Problem_01.hasUniqueAscii(""));
		Assert.assertFalse(Problem_01.hasUniqueAscii(null));
		Assert.assertTrue(Problem_01.hasUniqueAscii("Malik"));
	}
	
}
