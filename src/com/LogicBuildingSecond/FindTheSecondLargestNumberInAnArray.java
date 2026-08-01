package com.LogicBuildingSecond;

public class FindTheSecondLargestNumberInAnArray {

	public static void main(String[] args) {
		int input[] = { 100, 20, 30, 80, 60, 70 };
		
		int firstLargestNumber=Integer.MIN_VALUE;
		int secondLargestNumber=Integer.MIN_VALUE;
		
		for (int i = 0; i<= input.length-1; i++) {
			if (input[i]>firstLargestNumber) {
				secondLargestNumber=firstLargestNumber;
				firstLargestNumber=input[i];
			}else if ((input[i]<=firstLargestNumber) && (input[i]>= secondLargestNumber)) {
				secondLargestNumber=input[i];
			}
		}
		System.out.println("First largest number "+firstLargestNumber);
		System.out.println("Second largest number "+secondLargestNumber);

	}

}
