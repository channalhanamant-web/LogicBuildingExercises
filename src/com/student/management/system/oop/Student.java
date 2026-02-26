package com.student.management.system.oop;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	private int rollNumber;
	private Double marksObtainedInEnglish;
	private Double marksObtainedInMaths;
	private Double marksObtainedInScience;
	private double totalMarks;
	private double percentage;
	private String grade;

	public Student(String name, int age, int rollNumber, Double marksObtainedInEnglish, Double marksObtainedInMaths,
			Double marksObtainedInScience) {

		if (validateAge(age) && validateRollNumber(rollNumber) && validateMarks(marksObtainedInEnglish)
				&& validateMarks(marksObtainedInMaths) && validateMarks(marksObtainedInScience)) {

			this.name = name;
			this.age = age;
			this.rollNumber = rollNumber;
			this.marksObtainedInEnglish = marksObtainedInEnglish;
			this.marksObtainedInMaths = marksObtainedInMaths;
			this.marksObtainedInScience = marksObtainedInScience;

		}
	}

	public Student(String name, int age, int rollNumber, Double marksObtainedInEnglish, Double marksObtainedInMaths,
			Double marksObtainedInScience, double percentage, double totalMarks, String grade) {

		if (validateAge(age) && validateRollNumber(rollNumber) && validateMarks(marksObtainedInEnglish)
				&& validateMarks(marksObtainedInMaths) && validateMarks(marksObtainedInScience)) {

			this.name = name;
			this.age = age;
			this.rollNumber = rollNumber;
			this.marksObtainedInEnglish = marksObtainedInEnglish;
			this.marksObtainedInMaths = marksObtainedInMaths;
			this.marksObtainedInScience = marksObtainedInScience;
			this.percentage = percentage;
			this.totalMarks = totalMarks;
			this.grade = grade;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 10 && age <= 30) {
			this.age = age;
		} else {
			System.out.println("Invalid age for student");
		}

	}

	public boolean validateAge(int age) {
		if (age < 21 && age >= 10) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validateRollNumber(int rollNumber) {
		if (rollNumber <= 1 && age <= 100) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validateMarks(double marksForTheSubject) {
		if (marksForTheSubject >= 100 || marksForTheSubject < 0) {
			return false;
		} else {
			return true;
		}

	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public Double getMarksObtainedInEnglish() {
		return marksObtainedInEnglish;
	}

	public void setMarksObtainedInEnglish(Double marksObtainedInEnglish) {
		this.marksObtainedInEnglish = marksObtainedInEnglish;
	}

	public Double getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}

	public void setMarksObtainedInMaths(Double marksObtainedInMaths) {
		this.marksObtainedInMaths = marksObtainedInMaths;
	}

	public Double getMarksObtainedInScience() {
		return marksObtainedInScience;
	}

	public void setMarksObtainedInScience(Double marksObtainedInScience) {
		this.marksObtainedInScience = marksObtainedInScience;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public double getPercentage() {
		return percentage;
	}

	public String getGrade() {
		return grade;
	}

	public void calculateTotalMarks() {
		totalMarks = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;

	}

	public void calculatePercentage() {
		percentage = totalMarks / 3;
	}

	public void calculateGrade() {
		if (percentage >= 95) {
			grade = "A+";

		} else if (percentage >= 90) {
			grade = "A";
		} else if (percentage >= 85) {
			grade = "B+";
		} else if (percentage >= 80) {
			grade = "B";
		} else if (percentage >= 75) {
			grade = "C+";
		} else if (percentage >= 70) {
			grade = "C";
		} else if (percentage >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + ", marksObtainedInEnglish="
				+ marksObtainedInEnglish + ", marksObtainedInMaths=" + marksObtainedInMaths
				+ ", marksObtainedInScience=" + marksObtainedInScience + ", totalMarks=" + totalMarks + ", percentage="
				+ percentage + ", grade=" + grade + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, grade, marksObtainedInEnglish, marksObtainedInMaths, marksObtainedInScience, name,
				percentage, rollNumber, totalMarks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(grade, other.grade)
				&& Objects.equals(marksObtainedInEnglish, other.marksObtainedInEnglish)
				&& Objects.equals(marksObtainedInMaths, other.marksObtainedInMaths)
				&& Objects.equals(marksObtainedInScience, other.marksObtainedInScience)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& rollNumber == other.rollNumber
				&& Double.doubleToLongBits(totalMarks) == Double.doubleToLongBits(other.totalMarks);
	}

}
