package com.LogicBuildingSecond;

import java.util.HashMap;

public class CountTheFrequencyOfCharactersInString {

	public static void main(String[] args) {
		String input="madam";
		
		char inputArray[]=input.toCharArray();
		HashMap<Character, Integer> frequencyMap=new HashMap<Character, Integer>();
		
		for (char c : inputArray) {
			frequencyMap.put(c,frequencyMap.getOrDefault(c, 0)+1 );
		}
		
		System.out.println(frequencyMap);
		
		for (char x : frequencyMap.keySet()) {
			System.out.println(x +" "+ frequencyMap.get(x));
		}

	}

}
