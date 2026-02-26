package com.LogicBuilding;

import java.util.Arrays;
import java.util.HashSet;

public class FindTheIntersectionBetweenTwoArrays {

	public static void main(String[] args) {
		// common element between both arrays

		int num1[] = { 1, 2, 2, 1, 3 };
		int num2[] = { 2, 2, 3 };

		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> resultSet = new HashSet<Integer>();

		for (int no : num1) {
			set1.add(no);
		}
		for (int no2 : num2) {
			if (set1.contains(no2)) {
				resultSet.add(no2);
			}
		}
		System.out.println(resultSet);

		// converting result set into array format

		int resultArray[] = new int[resultSet.size()];
		int index = 0;
		for (int value : resultSet) {
			resultArray[index] = value;
			index++;
		}

		System.out.println(Arrays.toString(resultArray));

	}

}
