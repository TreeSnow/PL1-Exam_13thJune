package Exam;

import java.util.Scanner;

public class Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input;
		char ch;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input an alphabet (a-z | A-Z) :");
		input = kb.next();

		if (input.length() == 1) {
			ch = input.charAt(0);

			if (Character.isLetter(ch)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U') {

					System.out.println("Input letter is Vowel");
				} else {

					System.out.println("Input letter is Consonant");

				}

			} else {
				System.out.println("You did input wrong data !!"); // filtering case in which the input is not an
																	// alphabet!!
			}
		} else {
			System.out.println("You did input wrong data !!"); // filtering the case in which the input is a string !!

		}

		kb.close();
	}

}
