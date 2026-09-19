package com.LogicBuildingSecond;

import java.util.ArrayList;

public class EvenOrOddNumbersFromArrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("java");
		al.add(14);
		al.add(14.24);
		al.add(17);
		al.add(null);

		for (Object object : al) {

			if (object instanceof Integer) {
				if (((Integer) object).intValue() % 2 == 0) {
					System.out.println(object +" is even number");
				} else {
					System.out.println(object +" is odd Number");
				}
			}
		}

	}

}
