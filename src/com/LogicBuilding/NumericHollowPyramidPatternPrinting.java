package com.LogicBuilding;

public class NumericHollowPyramidPatternPrinting {

	public static void main(String[] args) {
		int totalNumberOfLines = 5;

		for (int row = 1; row <= totalNumberOfLines; row++) {

			for (int colum = 1; colum <= row; colum++) {

				// System.out.print(colum); for printing numbers
				// System.out.print("*"); for printing *
				System.out.print((char) ('a' + colum - 1)); // for printing alphabets

			}
			System.out.println(" ");

		}
	}

}
