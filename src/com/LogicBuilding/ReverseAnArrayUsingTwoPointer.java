package com.LogicBuilding;

public class ReverseAnArrayUsingTwoPointer {

	public static void main(String[] args) {
		int input[] = { 10, 20, 30, 40, 50 };
		int left = 0;
		int right = input.length - 1;
		int temp;

		while (right > left) {
			temp = input[left];
			input[left] = input[right];
			input[right] = temp;
			right--;
			left++;

		}
		for (int number : input) {
			System.out.print(number + " ");
		}

	}

}
