package com.syntax.class2;

import java.util.Scanner;


public class HWScan3 {

	public static void main(String[] args) {
/*
 * You are DMV representative and you need to ask customer their age. 
 * If they
 * are 18 and older you will issue a driver license to them, otherwise you will offer them to get a learners permit.
 */
		System.out.println(" Please enter your age ");
		Scanner scan=new Scanner(System.in);
		int yourAge= scan.nextInt();
		System.out.println(" You can get your license ");
		
	{if (yourAge <=18){
		System.out.println(" Sorry you can get learners permit only");
	}
	}
		
		
		
	}

}
