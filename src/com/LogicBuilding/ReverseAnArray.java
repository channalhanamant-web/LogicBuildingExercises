package com.LogicBuilding;

public class ReverseAnArray {

	public static void main(String[] args) {
		int input[] = { 10, 20, 30, 40 };
		int reverseArray[] = new int[input.length];
		int j = 0;
		for (int i = input.length - 1; i >= 0; i--) {

			reverseArray[j] = input[i];

			j++;
		}
		for (int num : reverseArray) {
			System.out.print(num + " ");
		}

	}

}
