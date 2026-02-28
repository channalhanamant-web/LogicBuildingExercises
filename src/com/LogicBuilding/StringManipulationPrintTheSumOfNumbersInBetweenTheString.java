package com.LogicBuilding;

public class StringManipulationPrintTheSumOfNumbersInBetweenTheString {

	public static void main(String[] args) {
		String input = ("QWE12RT350Y10");
		StringBuilder sb = new StringBuilder();

		int sum = 0;
		for (char c : input.toCharArray()) {
			if (Character.isDigit(c)) {

				sb.append(c);

			} else {
				if (sb.length() > 0) {
					sum = sum + Integer.parseInt(sb.toString());
					sb.setLength(0);
				}
			}

		}
		if (sb.length() > 0) {
			sum = sum + Integer.parseInt(sb.toString());

		}
		System.out.println(sum);

	}

}
