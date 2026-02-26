package com.LogicBuilding;

public class FindTheLengthOfTheStringWithoutLengthAndToCharArrayMethod {

	public static void main(String[] args) {
		String dataString = "hello";
		int count = 0;

		while (true) {
			try {
				dataString.charAt(count);
				count++;
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println(count);
				break;
			}
		}

	}

}
