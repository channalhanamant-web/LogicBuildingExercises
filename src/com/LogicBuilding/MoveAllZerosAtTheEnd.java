package com.LogicBuilding;

public class MoveAllZerosAtTheEnd {

	public static void main(String[] args) {
		int a[] = { 1, 0, 2, 0, 3, 0 };
		int nonZeroValue = 0;
		for (int current = 0; current < a.length; current++) {

			if (a[current] != 0) {
				int temp = a[nonZeroValue];

				a[nonZeroValue] = a[current];
				a[current] = temp;
				nonZeroValue++;

			}

		}
		for (int i : a) {
			System.out.print(i + " ");
		}

	}

}
