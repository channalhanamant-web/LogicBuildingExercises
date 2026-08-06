package com.LogicBuildingSecond;

public class StringBufferMethods {

	public static void main(String[] args) {
		String str="Hello World";
		
		String str1= new String("Hello World");
		
		StringBuffer sb= new StringBuffer("Hello world");
		
		System.out.println(str.length());
		System.out.println(sb.length());
		
		System.out.println(str.concat("1234"));
		System.out.println(str+"1234");
		System.out.println(sb.append(123));
		
		System.out.println(str.charAt(0));
		System.out.println(sb.charAt(0));
		
		System.out.println(str.indexOf('e'));
		System.out.println(sb.indexOf("e"));
		
		System.out.println(str.lastIndexOf('l'));
		System.out.println(sb.lastIndexOf("l"));
		
		System.out.println(str.isEmpty());
		System.out.println(sb.isEmpty());
		
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		System.out.println(sb.insert(11, " java"));
		
		System.out.println(sb.deleteCharAt(0));
		System.out.println(sb.delete(0, 2));
		System.out.println(sb.reverse());
		System.out.println(sb.replace(3, 10, "lo"));
		
		System.out.println(sb.capacity());//

	}

}
