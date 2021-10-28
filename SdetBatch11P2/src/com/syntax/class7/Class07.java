package com.syntax.class7;

import java.util.Scanner;

public class Class07 {

	public static void main(String[] args) {
		int secretNumber = 78;
		Scanner scan = new Scanner(System.in);
		int userNumber;
		
		do {
			System.out.println(" Please guess my secret number ");
			
			userNumber = scan.nextInt();
			
		}while (userNumber!=secretNumber);
		
		System.out.println(" You got it ");
	
		
	}

}
