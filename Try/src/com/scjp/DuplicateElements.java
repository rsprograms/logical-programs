package com.scjp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello World";
		//Set<Character> allCharacters = new HashSet<Character>();
		//Set<Character> duplicateCharacters = new HashSet<Character>();
		
		Map<Character, Integer> duplicateCharacters = new HashMap<Character, Integer>();	
		
		//pickDuplicates(s, allCharacters, duplicateCharacters);
		
		/*Iterator<Character> it = duplicateCharacters.iterator();
		
		Set<Character> allCharacters = new HashSet<Character>();
		
		while(it.hasNext()) {
			System.out.println("Char : " + it.next());
		}*/
		
		Set<Character> finalCharacters = new HashSet<Character>();
		
		pickDuplicates(s, finalCharacters, duplicateCharacters);

	}
	
	public static void pickDuplicates(String ss, Set<Character> ac, Map<Character, Integer> dc) {
		for (int i = 0; i < ss.length(); i++) {
			Character c = ss.charAt(i);
			/*if (ac.contains(c)) {
				dc.add(c);
			} else {
				ac.add(c);
			}	*/
			
			dc.put(c, 1);
			
		}
	}
	

	
	

}
