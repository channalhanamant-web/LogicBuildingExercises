package com.LogicBuilding;

public class LeadersInArray {

	public static void main(String[] args) {
		// Leader value is Max value to all elements which are in right side to it
        //last element is always leader value
		int input[] = { 16, 17, 4, 3, 5, 2 };
		// Set<Integer> result=new HashSet<Integer>();
		int maxRight = input[input.length - 1];
		System.out.println(maxRight);
		for (int i = input.length - 2; i >= 0; i--) {

			if (input[i] > maxRight) {

				maxRight = input[i];
				System.out.println(maxRight);
			}
		}

	}

}
