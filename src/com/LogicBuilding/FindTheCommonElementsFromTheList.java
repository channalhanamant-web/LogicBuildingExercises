 package com.LogicBuilding;

import java.util.ArrayList;

public class FindTheCommonElementsFromTheList {

	public static void main(String[] args) {
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("One");
		list1.add("How");
		list1.add("Ten");
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Two");
		list2.add("Ten");
		list2.add("How");
		//list2.add("One");
		
		//retainAll will retain all elements which are common b/w two list and will update the list1
		list1.retainAll(list2);
		
		System.out.println("Common elements are "+ list1);
	}

}
