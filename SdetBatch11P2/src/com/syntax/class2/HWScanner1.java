package com.syntax.class2;

import java.util.Scanner;

public class HWScanner1 {

	public static void main(String[] args) {
/*
 * Create a Java program to capture 2 numbers from a user and define which number is the largest.
 */
		System.out.println(" Please enter first number ");
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		System.out.println(" Please enter first number ");
		int n2=scan.nextInt();
		
		if (n1>n2) {
			System.out.println(n1+ "Is larger then" +n2);
		}else {
			System.out.println(n1+ "Less then" +n2);
		}
	}

}
