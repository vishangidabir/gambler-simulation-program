package com.game;
import java.util.Random;
public class GamblerResignUc3 {
	
	public static int STACK_EVERY_DAY = 100;
	public static final int BET_EVERY_DAY = 1;
	static int stackUpper = 150;
	static int stackLower = 50;

	public static void main(String[] args) {

		System.out.println("Welcome to the Gambling game!");

		for (int day = 1; day <= 20; day++) {
			while (true) {
				for (int i = 0; i < 100; i++) {
					Random random = new Random();
					int game = (int) (Math.random() * 2);
					if (game == 1) {
						System.out.println("Gambler won the game!");
						STACK_EVERY_DAY += BET_EVERY_DAY;

					} else {
						System.out.println("Gambler loss the game!");
						STACK_EVERY_DAY -= BET_EVERY_DAY;

					}
				}
				if (STACK_EVERY_DAY >= stackUpper) {
					System.out.println("Win 50%  :So resign the day");
					System.out.println(" Day" + day + " :remaining amount is " + STACK_EVERY_DAY);
					break;
				}
				if (STACK_EVERY_DAY == stackLower) {
					System.out.println("Loose 50% :So resign the day");
					System.out.println(" Day" + day + ": remaining amount is " + STACK_EVERY_DAY);
					break;
				}
			}
		}
	}
}
