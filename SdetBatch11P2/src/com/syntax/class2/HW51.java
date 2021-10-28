package com.syntax.class2;

import java.util.Scanner;

public class HW51 {

	public static void main(String[] args) {
/*
 * Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 

if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
 */
		String grade=null;
		Scanner input=new Scanner(System.in);
		System.out.println(" Please Enter Quiz Scores");
		double quizScores = input.nextDouble();
		
		System.out.println(" Please Enter Mid Term Scores");
		double midtermScores = input.nextDouble();
		
		System.out.println(" Please Enter Final Scores");
		double finalScores = input.nextDouble();
		
		double average =(quizScores+midtermScores+finalScores)/3;
		
		if (average >=90){
			grade ="A";
		
		}else if (average >=70 && average<90) {
			grade ="B";
		
		}else if (average >=50 && average<70) {
			grade ="C";
		
		}else if (average <50) {
			grade ="F try harder next time";
		
		}
		
		System.out.println(" Your grade is " + grade +".");
	}

}
