package com.LogicBuildingSecond;

public class NameShortener {

	public static void main(String[] args) {
		String fullName = "Hanamant Bhimappa Channal";
		String fullNameArray[] = fullName.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int index = 0; index < fullNameArray.length - 1; index++) {
			sb.append(fullNameArray[index].charAt(0) + ". ");
		}
		sb.append(fullNameArray[fullNameArray.length - 1]);
		System.out.println(sb.toString());
	}

}
