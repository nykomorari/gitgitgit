package com.syntax.class2;

import java.util.Scanner;

public class Class05 {

	public static void main(String[] args) {
		
		Scanner  in = new Scanner(System.in);
		System.out.println(" Please enter current time ");
		int time = in.nextInt();
		
		if(time>1 && time <=1) {
			System.out.println(" Right now is morning ");
		}else if (time>=12 && time <=15) {
			System.out.println(" Righ now is afternoon ");
		}else if (time>=16 && time<=20) {
			System.out.println(" Right now is evening ");
		}else if (time>=21 && time<=24) {
			System.out.println(" Right now is night ");
		}else {
			System.out.println(" Not valid time entered ");
		}

		
		System.out.println("************************************");
		
		String timeOfDay;
		if(time>=1 && time<=11) {
			timeOfDay="morning";
			
		}
	}

}
