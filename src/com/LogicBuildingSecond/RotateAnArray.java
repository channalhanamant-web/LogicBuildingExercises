package com.LogicBuildingSecond;

public class RotateAnArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		
		int left=0;
		int right=a.length-1;
		int key=3;
		
		while (left<right) {
			for (int index = 1; index <= 3; index++) {
				a[left]=a[right];
				left++;
				right--;
			}
		}
		
		

	}

}
