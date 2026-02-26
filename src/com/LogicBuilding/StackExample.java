package com.LogicBuilding;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();

		stack.push("Apple"); // 4 the position
		stack.push("Banana"); // 3rd position
		stack.push("Orange"); // 2nd position
		stack.push("Mango"); // 1st position

		System.out.println(stack.search("Apple")); // will give the position of topelement

		System.out.println(stack.pop()); // remove the top element from the stack and return it back to you

		System.out.println(stack.peek()); // it doesn't remove the element from the stack but returns the value

		System.out.println(stack.isEmpty()); // true -if empty else it's gonna retrun false

	}

}
