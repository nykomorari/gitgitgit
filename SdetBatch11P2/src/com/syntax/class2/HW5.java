package com.syntax.class2;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month define the season.
		 */
String season;
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter your birth month ");
		String month=scanner.nextLine();
		if (month.equalsIgnoreCase("December")|| month.equalsIgnoreCase(" January ")|| month.equalsIgnoreCase(" February")) {
			season= "Winter";
		}else if (month.equalsIgnoreCase(" March ")|| month.equalsIgnoreCase(" April ")|| month.equalsIgnoreCase(" May ")){
			season= " Spring ";
		}else if (month.equalsIgnoreCase(" June ")|| month.equalsIgnoreCase (" July ")|| month.equalsIgnoreCase(" August ")) {
			season= " Summer ";
		}else {
			season= " Fall ";
			}
		System.out.println(" Your season is" +season);
	}
	

}
