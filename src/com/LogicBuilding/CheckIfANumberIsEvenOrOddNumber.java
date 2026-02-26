package com.LogicBuilding;

import java.util.ArrayList;

public class CheckIfANumberIsEvenOrOddNumber {

	public static void main(String[] args) {
		//by default the the data type of arraylist will be object type if we don't pass any generic DT
		
		ArrayList aList=new ArrayList();
		aList.add("java");
		aList.add(23);
		aList.add(null);
		aList.add(24);
		aList.add(24.5);
		System.out.println(aList);
		
		for (Object object : aList) {
			if (object instanceof Integer) {
				// instanceof check whether value belongs to Integer type or not and it can only check non primitive DT
				//first we need type cast value from object type to Integer then that integer value to int
				//.intValue for converting Integer to int
				if (((Integer)object).intValue()%2==0) {
					System.out.println(object + " Number is Even number ");
				} else {
					System.out.println(object + " Number is odd number");

				}
			}
			
			
			
		}
	}

}
