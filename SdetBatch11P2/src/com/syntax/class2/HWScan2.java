package com.syntax.class2;

import java.util.Scanner;


public class HWScan2 {

	public static void main(String[] args) {
/*You are a loan specialist and you need to ask user what is the amount of loan is needed.
 *  If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
 * 
 */
		
		System.out.println("Please enter the loan amount");
		Scanner scan= new Scanner(System.in);
		int loanAmount=scan.nextInt();
		System.out.println(" Your loan amount is " +loanAmount);
		
	{if (loanAmount<=200000) {
		System.out.println("You are approved!!!");
	}else {
		System.out.println("Sorry your loan request has been declined");
	}
	}
	}
}
