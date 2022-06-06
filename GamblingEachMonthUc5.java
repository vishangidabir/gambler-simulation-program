package com.game;

import java.util.Random;

public class GamblingEachMonthUc5 {
	// UC1 : Initialized the stack every day & bet every day
	public static int STACK_EVERY_DAY = 100;
	public static final int BET_EVERY_DAY = 1;
	static int win, loss;
	static int winMax, loseMin;
	static int maxMonthly = 0, minMonthly = 0;
	static int stackUpper = 150;
	static int stackLower = 50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Gambling game!");
		// UC4 : calculate total amount for 30 days
		for (int day = 1; day <= 30; day++) {
			// UC3 : calculate gambler won or loss 50% of stack
			while (true) {
				// UC2 : Use random method to check win or loss
				for (int i = 0; i < 100; i++) {
					Random random = new Random();
					int game = (int) (Math.random() * 2);
					if (game == 1) {
						// System.out.println("you won the game");
						STACK_EVERY_DAY += BET_EVERY_DAY;

					} else {
						// System.out.println("you lost the game")
						STACK_EVERY_DAY += BET_EVERY_DAY;
					}
				}
				if (STACK_EVERY_DAY >= stackUpper) {
					System.out.println("Win 50%  :So resign the day");
					System.out.println(" Day" + day + " :remaining amount is " + STACK_EVERY_DAY);
					maxMonthly += STACK_EVERY_DAY;
					if (STACK_EVERY_DAY > winMax)
						winMax = STACK_EVERY_DAY;

					break;
				}
				if (STACK_EVERY_DAY == stackLower) {
					System.out.println("Loose 50% :So resign the day");
					System.out.println(" Day" + day + ": remaining amount is " + STACK_EVERY_DAY);
					minMonthly += STACK_EVERY_DAY;
					loseMin = STACK_EVERY_DAY;
					break;
				}
			}
		}
		System.out.println("\nLuckiest winning amount is :" + winMax);
		System.out.println("Unluckiest loosing amount is :" + loseMin);
		System.out.println("\nTotal monthly winning amount is :" + maxMonthly);
		System.out.println("Total monthly loosing amount is :" + minMonthly);
	}
}
