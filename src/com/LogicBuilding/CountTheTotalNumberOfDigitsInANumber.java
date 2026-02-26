package com.LogicBuilding;

public class CountTheTotalNumberOfDigitsInANumber {

	public static void main(String[] args) {
		int number = 1234345;
		int lastdigit;
		int reverse = 0;
		int count = 0;
		
		//Sol 1
//		String numberString=Integer.toString(number);
//		System.out.println(numberString.length());
		
		
		//Sol2
		while (number != 0) {
			lastdigit = number % 10;
			reverse = reverse * 10 + lastdigit;
			number = number / 10;
			count++;
		}
		System.out.println(count);

	}

}
