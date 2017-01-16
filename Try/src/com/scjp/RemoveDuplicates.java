package com.scjp;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		System.out.println("removing duplicates from AAABBABCC : " + removeDuplicatesFromString("AAABBABCC"));

	}

	private static String removeDuplicatesFromString (String givenVal) {
		Set<Character> charInString = new HashSet<Character> ();
		StringBuilder returnValue = new StringBuilder();
		for (int i = 0; i < givenVal.length() ; i++) {
			Character currentCharacter = givenVal.charAt(i);
			if (!(charInString.contains(currentCharacter))) {
				returnValue.append(currentCharacter);
				charInString.add(currentCharacter);
			}		
		}	
		return returnValue.toString();
	}
}
