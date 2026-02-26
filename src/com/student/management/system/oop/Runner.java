package com.student.management.system.oop;

public class Runner {

	public static void main(String[] args) {
		Student s1 = new Student("Uday", 17, 25, 80.00, 70.00, 71.00);
		s1.calculateTotalMarks();
		s1.calculatePercentage();
		s1.calculateGrade();
		System.out.println(s1);

		Student s2 = new Student("Raj", 1, 27, 80.00, 80.00, 80.00);
		s2.calculateTotalMarks();
		s2.calculatePercentage();
		s2.calculateGrade();
		System.out.println(s2);

		Student expectedData = new Student("Uday", 17, 25, 80.00, 70.00, 71.00);
		System.out.println(expectedData);

		Student actualData = new Student("Uday", 17, 25, 80.00, 70.00, 71.00);
		System.out.println(expectedData.equals(actualData));

	}

}
