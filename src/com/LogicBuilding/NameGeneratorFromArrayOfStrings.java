package com.LogicBuilding;

public class NameGeneratorFromArrayOfStrings {

	public static void main(String[] args) {
		// o/p RRaajhul
		String names[] = { "Raj", "Rahul", "Amit"};
		int maxlength = 0;
		for (String name : names) {
			maxlength = Math.max(maxlength, name.length());
		}
		System.out.println(maxlength);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < maxlength; i++) {

			for (String name : names) {
				if (i<name.length()) {
					sb.append(name.charAt(i));
				}
			}
		}
		System.out.println(sb);

	}

}
