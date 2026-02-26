package com.LogicBuilding;

public class StringManipulation {

	public static void main(String[] args) {
		// print '-' if consecutive number is odd and similar like 9-9-956
		String inputString = ("9949955");
		StringBuilder sb = new StringBuilder();

		// char inputArray[] = inputString.toCharArray();
		for (int i = 0; i < inputString.length() - 1; i++) {
			sb.append(inputString.charAt(i));
			int currentNo1 = Character.getNumericValue(inputString.charAt(i));
			int currentNo2 = Character.getNumericValue(inputString.charAt(i + 1));

			// if (inputArray[i] % 2 != 0 && inputArray[i + 1] == inputArray[i]) {
			if (currentNo1 % 2 != 0 && currentNo1 == currentNo2) {
				sb.append("-");
			}

		}
		sb.append(inputString.charAt(inputString.length() - 1));
		System.out.println(sb);

	}

}
