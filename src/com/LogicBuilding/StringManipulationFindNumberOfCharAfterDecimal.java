package com.LogicBuilding;

public class StringManipulationFindNumberOfCharAfterDecimal {

	public static void main(String[] args) {

		int sum = 0;
		double number = 123.3456;
		String input = String.valueOf(number);
		int indexOfDot = input.indexOf(".");
		for (int i = indexOfDot + 1; i < input.length(); i++) {
			sum++;
		}
//		//second solution
//		System.out.println(input.length()-indexOfDot-1);
		System.out.println(sum);

	}

}
