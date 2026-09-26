package com.LogicBuildingSecond;

public class TransposeMatrix {

	public static void main(String[] args) {
		int a[][] = new int[2][3];
		int resultMatrix[][] = new int[a[0].length][a.length];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				resultMatrix[col][row] = a[row][col];

			}
		}
		for (int row = 0; row < resultMatrix.length; row++) {
			for (int col = 0; col < resultMatrix[0].length; col++) {
				System.out.print(resultMatrix[row][col] + " ");

			}
			System.out.println("");
		}

	}

}
