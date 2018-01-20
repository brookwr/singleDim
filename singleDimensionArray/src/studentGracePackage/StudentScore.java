// StudentScore

// The purpose of this class is to input the
// number of students and determine the letter grade

// Author: Brook Worku
// Date: 11/04/2017



package studentGracePackage;

import java.util.Scanner;

public class StudentScore {
	
	public static void main(String[] args) {
		// declare variables
		int numStudents; // the number of students
		int[] grades; // the grades for students
		int cntr;
		char letGrade;

		// initialize variables
		numStudents = 0;
		grades = new int[0];
		letGrade = 'Z';
		
		
		numStudents = insertNumStudent("Please enter the number of students");
		grades = totalStudent(numStudents);
		for(cntr = 0; cntr < grades.length; cntr++) {
			letGrade = gradeAssign(grades[cntr]);
			System.out.println("Student " + cntr + " score is "+ grades[cntr] + " and grade is "+ letGrade );
		}

		System.out.println("JavaHome");
		

		System.out.println("JavaHome2");

	} // end main
	
	
	
	// gradeAssign
	//
	// the purpose of this method is to pass the score 
	// as an argument and return the letter grade
	// Input: score					the number grade
	// Return: letterGrade			the letter grade
	
	public static char gradeAssign(int score) {
		// declare variables
		char letterGrade;
		int MAXGRADE = 100;
		
		// initialize variables
		letterGrade = 'Z';
		
		if(score >= 0 && score <= 100) {
			if(score <= MAXGRADE && score > 89) {
				letterGrade = 'A';
			} else if(score <= 89 && score > 79) {
				letterGrade = 'B';
			} else if(score <= 79 && score > 69) {
				letterGrade = 'C';
			} else if (score <= 69 && score > 59) {
				letterGrade = 'D';
			} else {
				letterGrade = 'F';
			}
			
		} else {
			letterGrade = 'Z';
		}
		
		return letterGrade;
	} // end gradeAssign
	

	// inputGrade
	// 
	// the purpose of this method is to input grade
	// from the keyboard
	// 
	// Input: prompt		message
	// Return: stuGrade
	public static int inputGrade() {
		int stuGrade;
		String cleanUpStr;
		stuGrade = 0;
		cleanUpStr = "none yet";
		
		do {
			System.out.println();
			Scanner input = new Scanner(System.in);
			stuGrade = input.nextInt();
			//cleanUpStr = input.nextLine();
			if(stuGrade < 0 || stuGrade > 100) {
				System.out.println("Invalid grade of "+ stuGrade);
			}
		} while (stuGrade < 0 || stuGrade > 100);
		
		return stuGrade;
	} // end inputGrade
	
	
	// totalStudents
	// 
	// the purpose of this method is record 
	// the grades of the students
	//
	// Input: numStu		the number of student
	// Return: arrayGrade	array of student grade
	public static int[] totalStudent(int numStu) {
		int[] arrayGrade;
		int cntr;
		
		arrayGrade = new int[0];
		
		arrayGrade = new int [numStu];
		System.out.println("Enter "+ numStu + " scores: ");
		for(cntr = 0; cntr < arrayGrade.length; cntr++) {
			arrayGrade[cntr] = inputGrade();
		}
		return arrayGrade;
	}
	
	// insertNumStudent
	// 
	// the purpose of this method is to insert the number
	// of students
	//
	// Input: prompt			message to enter the number of students
	// Return: totStu			the total number of students
	public static int insertNumStudent(String prompt) {
		int totStu;
		String cleanUpStr;
		totStu = 0;
		cleanUpStr = "none yet";
		do {
			Scanner input = new Scanner(System.in);
			System.out.println(prompt);
			totStu = input.nextInt();
			cleanUpStr = input.nextLine();
			
			if(totStu < 0) {
				System.out.println("Invalid number of " + totStu);
			} 
		} while (totStu < 0);
			
		return totStu;
	
		
		
		
		
	} // end insertNumStudent
} // StudentScore
