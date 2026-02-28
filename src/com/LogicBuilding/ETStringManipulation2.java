package com.LogicBuilding;

public class ETStringManipulation2 {

	public static void main(String[] args) {
		String inputString = "r@56vi ku$%mar67";
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		for (char c : inputString.toCharArray()) {
			if (Character.isLetter(c) || c==' ') {
				sb.append(c);
			} else if (Character.isDigit(c)) {
				sum = sum + Character.getNumericValue(c);
			}

		}
		sb.append(sum);
		System.out.println(sb.toString());

	}

}
