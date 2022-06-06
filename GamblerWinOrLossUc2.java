package com.game;
import java.util.Random;
public class GamblerWinOrLossUc2 {

	public static int STACK_EVERY_DAY = 100;
	public static final int BET_EVERY_DAY = 1;
	static int win;
	int lose;

	public static void main(String[] args) {

		System.out.println("Welcome to the Gambling game!");
		
		Random random = new Random();
		int game = (int) (Math.random() * 2);

		while (true) {
			for (int i = 0; i < 100; i++) {
				if (game == 1) {
					STACK_EVERY_DAY += BET_EVERY_DAY;

				} else {
					STACK_EVERY_DAY -= BET_EVERY_DAY;

				}
				if (STACK_EVERY_DAY >= 150) {
					System.out.println("Win 50%  :So resign the day");
					break;
				}
				if (STACK_EVERY_DAY == 50) {
					System.out.println("Loose 50% :So resign the day");
					break;
				}
			}
		}
	}
}