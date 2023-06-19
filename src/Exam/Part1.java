package Exam;

import java.util.Scanner;

public class Part1 {

	static int APP = 3, SONG = 7; // Price of App & Song

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int prepay, buyApp = 0, buySong = 0, remainApp, remainSong, finalAppRemain, finalSongRemain, remainAfterApp,
				remainAfterSong, buyFirstApp, buyFirstSong, buyLaterApp = 0, buyLaterSong = 0;

		Scanner kb = new Scanner(System.in);
		System.out.println("How much money do you wish to prepay?");
		prepay = kb.nextInt();

		buyApp = prepay / APP; // Calculate how many Apps will be purchasable.
		buySong = prepay / SONG; // Calculate how many Songs will be purchasable.
		remainApp = prepay % APP; // Remain after buying maximum App(s)
		remainSong = prepay % SONG; // Remain after buying maximum Song(s)

		buyFirstApp = buyApp; // initialize how many App(s) are purchased firstly
		buyFirstSong = buySong; // initialize how many Song(s) are purchased firstly
		remainAfterApp = remainApp;
		remainAfterSong = remainSong;

		if (remainAfterApp != 0) { // In Case, remain amount after buying max. App(s) is greater than Song's price,
			if (remainAfterApp >= SONG) { // it will show how many song(s) can be purchased additionally.
				buyLaterSong = remainAfterApp / SONG;
				finalAppRemain = remainAfterApp % SONG;
			} else {
				finalAppRemain = remainAfterApp;

			}

		} else {
			finalAppRemain = 0;
		}

		if (remainAfterSong != 0) { // In Case, remain amount after buying max. Song(s) is greater than App's price,
			if (remainAfterSong >= APP) { // it will show how many app(s) can be purchased additionally.
				buyLaterApp = remainAfterSong / APP;
				finalSongRemain = remainAfterSong % APP;
			} else {
				finalSongRemain = remainAfterSong;

			}

		} else {
			finalSongRemain = 0;
		}

		System.out.printf(
				"With this amount, you will be able to purchase %d app(s). You will then have %d$ left as a credit on your account. %n",
				buyFirstApp, finalAppRemain);
		System.out.printf(
				"Alternateively, for this amount, you will be able to purchase %d song(s) and %d app(s). You will then have %d$ left as a credit on your account. %n",
				buyFirstSong, buyLaterApp, finalSongRemain);
		System.out.printf("Thanks for Shopping at Best Music Store!");

		kb.close();

	}

}
