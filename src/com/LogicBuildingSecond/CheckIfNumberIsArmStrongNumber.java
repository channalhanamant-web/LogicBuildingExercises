package com.LogicBuildingSecond;

public class CheckIfNumberIsArmStrongNumber {

	public static void main(String[] args) {
		// sum of cube of each digit is equal to the given number

		int number = 153;

		int n = number;
		int lastDigit;
		int armStrongNum = 0;

		while (n != 0) {

			lastDigit = n % 10;
			armStrongNum = armStrongNum + (lastDigit * lastDigit * lastDigit);
			n = n / 10;

		}
		if (number == armStrongNum) {
			System.out.println("Number Is ArmStrong Number");
		} else {
			System.out.println("Number Is Not ArmStrong Number");
		}

	}

}
