package com.student.management.system;

import java.util.Scanner;

public class StudentManagementSystem {

	public static void main(String[] args) {
		// store the information of student

		String studentName[] = new String[100];
		int studentAge[] = new int[100];
		double[] marksObtainedInEnglish = new double[100];
		double[] marksObtainedInScience = new double[100];
		double[] marksObtainedInMaths = new double[100];
		String[] studentGrade = new String[100];
		int[] studentRollNumber = new int[100];

		System.out.println("Student management system");

		// reading value from console
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the student name");
		studentName[0] = scanner.next();

		System.out.println("Enter the student age");
		studentAge[0] = scanner.nextInt();

		System.out.println("Enter the student roll number");
		studentRollNumber[0] = scanner.nextInt();

		System.out.println("Enter marks for English");
		marksObtainedInEnglish[0] = scanner.nextDouble();

		System.out.println("Enter marks for Maths");
		marksObtainedInMaths[0] = scanner.nextDouble();

		System.out.println("Enter marks for Science");
		marksObtainedInScience[0] = scanner.nextDouble();

		double totalMarksObtained = marksObtainedInEnglish[0] + marksObtainedInMaths[0] + marksObtainedInScience[0];
		double percentage = totalMarksObtained / 3;

		if (percentage >= 95) {
			studentGrade[0] = "A+";
		} else if (percentage >= 85) {
			studentGrade[0] = "B+";
		} else if (percentage >= 35) {
			studentGrade[0] = "c";
		} else {
			studentGrade[0] = "F";
		}

//		System.out.println("Enter student Grade");
//		studentGrade = scanner.next();

		// can't read single char with scanner class: in string format and then convert
		// string to char!

		System.out.println("Student name: " + studentName[0]);
		System.out.println("Student age: " + studentAge[0]);
		System.out.println("Student RollNumber: " + studentRollNumber[0]);

		System.out.println("Marks Obtained:");
		System.out.println("English: " + marksObtainedInEnglish[0]);
		System.out.println("Maths: " + marksObtainedInMaths[0]);
		System.out.println("Science: " + marksObtainedInScience[0]);
		System.out.println("Student Grade: " + studentGrade[0]);
	}

}
