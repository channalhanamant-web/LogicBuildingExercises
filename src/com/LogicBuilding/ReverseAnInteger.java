package com.LogicBuilding;

public class ReverseAnInteger {

	public static void main(String[] args) {
		int number = 123;
		int lastdigit;
		int reverseNo = 0;
		while(number!=0)
		{
			lastdigit=number%10;
			reverseNo= reverseNo*10+lastdigit;
			number=number/10;
			
		}
		System.out.println(reverseNo);

	}

}
