package com.LogicBuilding;

public class ConvertTheNumberToRomanValue {

	public static void main(String[] args) {
		int num = 98;
		String symbols[] = { "L", "X", "V", "I" };
		int romanValues[] = { 50, 10, 5, 1 };
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < romanValues.length; i++) {

			while (num >= romanValues[i]) {
				num = num - romanValues[i];

				sb.append(symbols[i]);

			}

		}
		System.out.println(sb.toString());

	}

}
