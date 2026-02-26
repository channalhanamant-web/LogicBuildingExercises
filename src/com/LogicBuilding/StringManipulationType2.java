package com.LogicBuilding;

public class StringManipulationType2 {

	public static void main(String[] args) {
		// o/p T@m@@rr@@@w
		String inputString = ("Tomorrow");
		StringBuilder sb = new StringBuilder();
		int count = 0;
		char inputArray[] = inputString.toCharArray();

		for (char c : inputArray) {

			if (c == 'o' || c == 'O') {
//				for (int i = 0; i < count; i++) {
//					sb.append('@');
//				}
				count++;
				sb.append("@".repeat(count));

			} else {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}

}
