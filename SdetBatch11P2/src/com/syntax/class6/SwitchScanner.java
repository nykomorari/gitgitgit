package com.syntax.class6;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {

		Scanner country = new Scanner(System.in);
		System.out.println(" Please enter a country");
		String name = country.next();
		String language = null;

		switch (name) {

		case "USA":
			language = " English ";
			break;

		case " Russia ":
			language = " Russian ";
			break;

		case " Ukraine ":
			language = " Ukrainian ";
			break;
		default:
			language = " Unknown ";
		}
		System.out.println(" you speaks " + language);
	}

}
