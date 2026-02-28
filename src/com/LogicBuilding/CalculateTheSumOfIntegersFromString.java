package com.LogicBuilding;

public class CalculateTheSumOfIntegersFromString {

	public static void main(String[] args) {
		String input = "This is 1000 and it should be 20 30 50 and 1050";
		String inputArray[] = input.split(" ");
		int sum = 0;
		for (String string : inputArray) {
			try {
				int num = Integer.parseInt(string);
				sum = sum + num;
			} catch (NumberFormatException e) {

			}

		}
		
		System.out.println(sum);
	}
}
