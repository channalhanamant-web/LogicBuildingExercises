package com.LogicBuildingSecond;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonElementsInTwoList2 {

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

		Set<String> resultSet = new HashSet<String>();
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i).equalsIgnoreCase(list2.get(j))) {
					resultSet.add(list1.get(i));
				}
			}
		}
		System.out.println(resultSet);
	}

}
