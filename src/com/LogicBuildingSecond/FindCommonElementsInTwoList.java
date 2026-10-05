package com.LogicBuildingSecond;

import java.util.ArrayList;
import java.util.List;

public class FindCommonElementsInTwoList {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();

		list1.add("one");
		list1.add("two");
		list1.add("three");
		list1.add("four");
		list1.add("five");

		List<String> list2 = new ArrayList<String>();

		list2.add("one");
		list2.add("four");
		list2.add("five");
		list2.add("six");
		
		System.out.println(list2.contains(list1));

	}

}
