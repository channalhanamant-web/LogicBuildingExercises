package com.LogicBuildingSecond;

public class CalculateTheSumOfIntegersFromString {

	public static void main(String[] args) {
		String input = "This is 1000 and it should be 20 30 50 1050";

		String[] inputArray = input.split(" ");
		int sum = 0;
		for (String string : inputArray) {
			try {
				int no = Integer.parseInt(string);
				sum = sum + no;
			} catch (NumberFormatException e) {

			}

		}
		System.out.println(sum);

	}

}
