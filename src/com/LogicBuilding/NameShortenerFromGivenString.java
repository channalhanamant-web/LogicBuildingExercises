package com.LogicBuilding;

public class NameShortenerFromGivenString {

	public static void main(String[] args) {
		String fullName = "  Hanamant Bhimappa Channal ";
		String[] nameParts = fullName.trim().split(" ");

		StringBuilder sB = new StringBuilder();

		for (int i = 0; i < nameParts.length - 1; i++) {
			sB.append(nameParts[i].charAt(0)).append(". ");
		}
		sB.append(nameParts[nameParts.length - 1]);

		System.out.println(sB);

	}

}
