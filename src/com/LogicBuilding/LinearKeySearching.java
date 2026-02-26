package com.LogicBuilding;

public class LinearKeySearching {

	public static void main(String[] args) {

		int input[] = { 10, 20, 30, 5, 40 };
		int key = 5;
		boolean isPresent = false;
		for (int temp : input) {
			if (temp == key) {
				// System.out.println("Given key is present in Array");
				isPresent = true;
				break;
			}

		}
		if (isPresent) {
			System.out.println("Value found in the array");
		} else {
			System.out.println("Value is not found in the array");
		}

	}

}
