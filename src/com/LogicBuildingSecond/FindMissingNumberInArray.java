package com.LogicBuildingSecond;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int sumOriginal = 0;
		int a[] = { 1, 2, 4, 5, 6 };
		int sum = 0;
		int totalNumbers=6;
		
		sumOriginal=(totalNumbers*(totalNumbers+1))/2;
		

//		for (int i = 1; i <= 6; i++) {
//			sumOriginal = sumOriginal + i;
//		}
		
		
		for (int i : a) {
			sum = sum + i;
		}
		System.out.println("Missing number is " + (sumOriginal - sum));

	}

}
