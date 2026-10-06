package com.LogicBuildingSecond;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

		// lambda expressions
		// Set<String> resultSet = list1.stream().filter(x ->
		// list2.contains(x)).collect(Collectors.toSet());

		// using stream
		// Set<String> resultSet2 =
		// list1.stream().filter(list2::contains).collect(Collectors.toSet());

		Set<String> resultSet = list1.stream().filter(x -> list2.contains(x)).collect(Collectors.toSet());

		Set<String> resultSet2 = list1.stream().filter(list2::contains).collect(Collectors.toSet());

		System.out.println(resultSet);
		System.out.println(resultSet2);

		list1.retainAll(list2);
		System.out.println(list1);
	}

}
