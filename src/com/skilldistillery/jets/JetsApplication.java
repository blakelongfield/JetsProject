package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		JetsApplication app = new JetsApplication();
		app.launch();
	}

	public void launch() {
	}

	public void displayUserMenu() {
		String input;
		
		do {
			System.out.println("1. List fleet");
			System.out.println("2. Fly all jets");
			System.out.println("3. View fastest jet");
			System.out.println("4. View jet with longest range");
			System.out.println("5. Load all Cargo Jets");
			System.out.println("6. Dogfight");
			System.out.println("7. Add a jet to fleet");
			System.out.println("8. Exit program");
			sc.next();
		
		switch (input) {
		default:
			System.out.println("Please enter a valid response");
			displayUserMenu();
		case "1": 
			System.out.println(Airfield());
			displayUserMenu();
		case "2":
			System.out.println(fly());
			displayUserMenu();
			break;
		case "3":
			System.out.println(fastestJet());
			displayUserMenu();
			break;
		case "4":
			longestRange();
			displayUserMenu();
			break;
		case "5":
			System.out.println(dogfight());
			displayUserMenu();
			break;
		case "6":
			dogfight();
			break;
		case "7":
			addJet();
			break;
		case "8":
			break;
		} while (!input.equals("1") ||  (!input.equals("2")) || (!input.equals("3")) || (!input.equals("4")) || (!input.equals("5"))
		|| (!input.equals("6")) || (!input.equals("7")) || (!input.equals("8")));
	}
}

/*
 * } if (input.equals("3")) { fastestJet(); } if (input.equals("4")) {
 * longestRange(); } if (input.equals("5")) { loadCargoJets(); } if
 * (input.equals("6")) { dogfight(); } if (input.equals("7")) { addJet(); } if
 * (input.equals("8")) { break; } else {
 * System.out.println("Error, please enter a valid response"); }
 */
