package com.LogicBuilding;

public class CalculateTheTotalSumOfAllElementsInAnArray {

	public static void main(String[] args) {
		int input[] = { 4, 5, 10, 3, 7 };
		int sum = 0;
		for (int i : input) {
			sum = sum + i;
		}
		System.out.println("Total sum of the Array " + sum);

		// Avg
		int totalElements = input.length;

		// Average might be double
		double avg = ((double) sum) / totalElements;
		System.out.println("Average value of the Array " + avg);

	}

}
