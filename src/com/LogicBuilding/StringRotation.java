package com.LogicBuilding;

public class StringRotation {

	public static void main(String[] args) {
		// WHEN s1 Rotated it must equal to s2
		String s1 = ("INTERVIEW");
		String s2 = ("VIEWINTER");

		if (s1.length() == s2.length() && (s1 + s2).contains(s2)) {
			System.out.println("Two string are rotation of each other");

		} else {

			System.out.println("No");

		}

	}

}
