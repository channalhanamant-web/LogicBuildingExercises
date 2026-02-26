package com.LogicBuilding;

import java.util.Arrays;

public class RemoveDuplicateValuesFromArraysUsingStreams {

	public static void main(String[] args) {
		int input[] = { 20, 10, 30, 20, 10, 40 };

		System.out.println(Arrays.toString(input));
		input = Arrays.stream(input).distinct().toArray();
		System.out.println(Arrays.toString(input));

	}

}
