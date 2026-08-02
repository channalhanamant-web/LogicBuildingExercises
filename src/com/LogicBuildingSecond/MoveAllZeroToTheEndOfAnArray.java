package com.LogicBuildingSecond;

import java.util.Arrays;

public class MoveAllZeroToTheEndOfAnArray {

	public static void main(String[] args) {
		int a[] = { 1, 1, 0, 2, 0, 3, 0, 0 };
		
		int nonZeroValue=0;
		int temp;
		
		for (int current = 0; current <= a.length-1; current++) {
			if (a[current] !=0) {
				temp=a[current];
				a[current]=a[nonZeroValue];
				a[nonZeroValue]=temp;
				
				nonZeroValue++;
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
