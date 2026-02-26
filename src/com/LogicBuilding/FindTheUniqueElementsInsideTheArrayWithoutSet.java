package com.LogicBuilding;

public class FindTheUniqueElementsInsideTheArrayWithoutSet {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 1, 2, 4 };

		for (int num : a) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (num == a[i]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(num);
			}
		}

	}

}
