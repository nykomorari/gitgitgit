package com.syntax.class2;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=100;
		number+=100;
		System.out.println(number);
		
		
		/*
		 * Declare variable and decrease by 67 using shorthand operator
		 */
		int number2=100;
		number2-=67;
		System.out.println(number2);
		
		
		/*
		 * Declare variable cakePiece=11 and divide cakePiece between
		 * 4 people using shorthand operator
		 * each person should get an equal piece of cake
		 */
		System.out.println("****************");
		int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece/4);
		System.out.println(cakePiece%4);
		
		/*
		 * Declare variable cakePiece=25 and divide cakePiece between 7 people
		 * Using shorthand operator found out how many pieces of cake left
		 * after it was distributed equally among 7 people
		 */
		
		System.out.println("*****************");
		cakePiece=25;
		cakePiece/=7;
		
		System.out.println(cakePiece);
		cakePiece=25;
		System.out.println(cakePiece%7);
		
		

	}

}
