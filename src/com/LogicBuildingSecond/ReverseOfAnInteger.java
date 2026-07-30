package com.LogicBuildingSecond;

public class ReverseOfAnInteger {

	public static void main(String[] args) {
		int input = 123;

		int x = input;
		int reverseNum = 0;
		int lastDigit;

		while (x != 0) {
			lastDigit = x % 10;
			reverseNum = reverseNum * 10 + lastDigit;
			x = x / 10;
		}

		System.out.println(reverseNum);

	}

}
