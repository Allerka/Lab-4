package co.grandcircus;

import java.util.Scanner;

public class SquaresCubes {

	public static void main(String[] args) {
		// initial setup
		Scanner scan = new Scanner(System.in);
		char cont = 'y';

		// primary loop and user input
		while (cont == 'y' || cont == 'Y') {
			System.out.print("It's time to figure out some squares and cubes! Give me a number: ");
			int entry = scan.nextInt();
			System.out.println();
			header();
			calculator(entry);

			System.out.print("Continue? (y/n) ");
			cont = scan.next().charAt(0);
		}
		// closing the program
		System.out.println("Exiting!");
		scan.close();
	}

	// prints the chart header row
	private static void header() {
		System.out.printf("%-8s %4s %6s\n", "Number", "Squared", "Cubed");
		System.out.printf("%-8s %4s %8s\n", "=======", "=======", "=======");
		return;
	}

	// calculates the squares and cubes
	private static void calculator(int entry) {
		for (int i = 1; i <= entry; i++) {
			System.out.printf("%-8d %-8d %-1d\n", i, (i * i), (i * i * i));
		}
		return;
	}
}
