package com.LogicBuilding;

public class EncodingTheStringIMP {

	public static void main(String[] args) {
		String input = "ddmmmmtta";
		// char inputArray[] = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int j = 1; j < input.length(); j++) {

			if (input.charAt(j) == input.charAt(j - 1)) {
				count++;

			} else {
				sb.append(input.charAt(j - 1));
				sb.append(count);
				count = 1;

			}

		}
		sb.append(input.charAt(input.length() - 1));
		sb.append(count);
		System.out.println(sb);

	}

}
