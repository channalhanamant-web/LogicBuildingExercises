package com.LogicBuilding;

public class PatternPrintingTriangle {

	public static void main(String[] args) {
		int totalNumberOfLines = 5;

		for (int row = 1; row <= totalNumberOfLines; row++) {

			for (int colum = 1; colum <= row; colum++) {
				if (colum == 1 || row == colum || row == totalNumberOfLines) {
					System.out.print(colum);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

}
