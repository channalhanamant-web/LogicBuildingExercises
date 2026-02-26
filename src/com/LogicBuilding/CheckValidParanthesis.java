package com.LogicBuilding;

import java.util.Stack;

public class CheckValidParanthesis {

	public static void main(String[] args) {
		String input = "()";
		System.out.println(checkParanthesis(input));

	}

	private static boolean checkParanthesis(String input) {
		char inputArray[] = input.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (Character character : inputArray) {
			if (character == '(') {
				stack.push(character);

			} else {
				if (character == ')') {
					if (stack.isEmpty()) {
						return false;

					} else {
						char topChar = stack.pop();
						if (topChar != '(') {
							return false;
						}
					}

				} else {

				}

			}

		}
		return stack.isEmpty();

	}

}
