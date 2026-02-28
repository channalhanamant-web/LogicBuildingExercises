package com.LogicBuilding;

import java.util.LinkedList;

public class EYStringManipulation {

	public static void main(String[] args) {
		String inputString = "a1b2c3";
		LinkedList<Character> list = new LinkedList<Character>();

		for (int i = 1; i < inputString.length(); i = i + 2) {
			list.add(inputString.charAt(i));
		}
		System.out.println(list);

		int index = list.size() - 1;

		StringBuilder sb = new StringBuilder();
		for (Character character : inputString.toCharArray()) {
			if (Character.isDigit(character)) {
				sb.append(list.get(index));
				index--;
			} else {
				sb.append(character);
			}
		}
		System.out.println(sb);

	}

}
