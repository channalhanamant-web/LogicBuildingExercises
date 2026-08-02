package com.LogicBuildingSecond;

public class LinearSearchingFindKeyValueInAnArray {

	public static void main(String[] args) {
		int input[] = { 10, 20, 30, 5, 40 };
		int key = 5;
		boolean isPresent = false;

		for (int i : input) {
			if (i == key) {
				isPresent = true;
				break;
			}
		}
		if (isPresent) {
			System.out.println("Key is present");
		} else {
			System.out.println("Key is not present");
		}

	}

}
