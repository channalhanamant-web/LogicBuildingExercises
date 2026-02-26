package com.LogicBuilding;

public class CheckIfANumbIsAnARMSTRONGNumber {

	public static void main(String[] args) {
		//addition of all cube of each digit is equal to n (1^3+5^3+2^3)
		int n = 152;
		int lastDigit;
		int copy = n;
		int armstrong = 0;
		while (n != 0) {
			lastDigit = n % 10;
			armstrong = armstrong + (lastDigit * lastDigit * lastDigit);
			n = n / 10;
		}
		if(armstrong==copy)
			System.out.println("Given number is armstrong number");
		
		else
			System.out.println("Given number is not a armstrong number");

	}

}
