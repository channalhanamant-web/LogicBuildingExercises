package com.LogicBuilding;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int numbers[] = { 1, 24, 33, 44 };
		int sum = 0;
		for (int temp : numbers) {
			sum = sum + temp;
		}
		System.out.println(sum);

	}

}
