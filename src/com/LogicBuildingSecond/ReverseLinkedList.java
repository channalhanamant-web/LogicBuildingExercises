package com.LogicBuildingSecond;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

	public static void main(String[] args) {
		List<Integer> ogList = new LinkedList<Integer>();
		ogList.add(1);
		ogList.add(2);
		ogList.add(3);
		ogList.add(4);
		ogList.add(5);

		System.out.println("Original list ---> "+ogList);
		
		//java 21 onwards, but not good practice to write this code
		System.out.println("Reversed list ---> "+ogList.reversed());
	}

}
