package com.LogicBuildingSecond;

public class StringMethodsExamples {

	public static void main(String[] args) {
		String data = "   Apple  ";
		String data2 = "apple";

		System.out.println(data.hashCode());
		System.out.println(data2.hashCode());

		System.out.println(data == data2);
		System.out.println(data.equals(data2));
		System.out.println(data.equalsIgnoreCase(data2));

		System.out.println(data.length());
		System.out.println(data.trim());
		
		System.out.println(data.toLowerCase());
		System.out.println(data.toUpperCase());
		
		System.out.println(data+"abc");
		System.out.println(data.concat(data2));
		
		System.out.println(data.charAt(4));
		System.out.println(data.contains("pp"));
		
		System.out.println(data.isEmpty());
	}

}
