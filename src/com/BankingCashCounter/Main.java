package com.BankingCashCounter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/**
		 * PROCEDURE
		 * =========== 
		 *1.user input choice 
		 *2.created object of class 
		 *3.calling method with help of object
		 * ==========================================
		 */
		int ch;
		System.out.println("-------Welcome to International Bank-------\n");
		System.out.println("(Hint : your pasword is - 123 \n starting bal -2000)\n");
		System.out.println("1.Deposite \n2.Witdrawal \n3.check balance");
		System.out.println("\nHow can we Help You !\n");

		/*
		 * 1. User input choice
		 */
		System.out.print("\nEnter Your choice:");
		Scanner s2 = new Scanner(System.in);

		/*
		 * 2.created object of class
		 */
		Server b = new Server();
		ch = s2.nextInt();

		/*
		 * 3.calling method with help of object
		 */
		switch (ch) {
		case 1:
			b.Deposite();

			break;
		case 2:
			b.Withdrawl();
			break;
		case 3:
			b.balance();
			break;
		default:
			System.out.print("Invalid Choice");
		}
	}
}
