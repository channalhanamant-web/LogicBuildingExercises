package com.LogicBuilding;

public class FindTheLengthOfTheStringWithoutDotLengthMethod {

	public static void main(String[] args) {
		String dataString = "hello";
		char dataArray[] = dataString.toCharArray();
		int count = 0;
		for (char c : dataArray) {
			count++;
		}

		System.out.println(count);
	}

}
