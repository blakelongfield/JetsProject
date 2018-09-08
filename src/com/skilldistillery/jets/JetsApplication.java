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
		AirField af = new AirField();
		
		do {
			System.out.println("1. List fleet");
			System.out.println("2. Fly all jets");
			System.out.println("3. View fastest jet");
			System.out.println("4. View jet with longest range");
			System.out.println("5. Load all Cargo Jets");
			System.out.println("6. Dogfight");
			System.out.println("7. Add a jet to the fleet");
			System.out.println("8. Exit program");
			sc.next();
		
		switch (input) {
		default:
			System.out.println("Please enter a valid response");
			displayUserMenu();
		case "1": 
			af.airField();
			displayUserMenu();
		case "2":
			//flyAllJets();
			displayUserMenu();
			break;
		case "3":
			//fastestJet();
			//in the fighterJet class
			displayUserMenu();
			break;
		case "4":
			//longestRange();
			displayUserMenu();
			break;
		case "5":
			//loadCargo();
			displayUserMenu();
			break;
		case "6":
			//dogfight();
			break;
		case "7":
		//	addJet();
			break;
		case "8":
			break;
		} while (!input.equals("1") ||  (!input.equals("2")) || (!input.equals("3")) || (!input.equals("4")) || (!input.equals("5"))
		|| (!input.equals("6")) || (!input.equals("7")) || (!input.equals("8"))); 

}
		
		public void flyAllJets(Jet[] jet) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Which plane would you like to fly?");
			System.out.println("1. " + jet[0].getModel());
			System.out.println("2. " + jet[1].getModel());
			System.out.println("3. " + jet[2].getModel());
			System.out.println("4. " + jet[3].getModel());
			System.out.println("5. " + jet[4].getModel());
			System.out.println("Quit");
			String input = scanner.nextLine();
			
			if (input.equals("1")) {
				System.out.println("The " + jet[0].getModel() + "take's flight..");
				System.out.println();
				System.out.println(jet[0] + "");
					// print specs of the jet here^^^^^
				System.out.println("The plane will be able to travel approximately " + (jet[0].getRange() / jet[0].getSpeed()) + " miles before needing to refuel");
			}
			if (input.equals("2")) {
				System.out.println("The " + jet[1].getModel() + "take's flight..");
				System.out.println();
				System.out.println(jet[0] + "");
						// print specs of the jet here^^^^^
						System.out.println("The plane will be able to travel approximately " + (jet[1].getRange() / jet[1].getSpeed()) + " miles before needing to refuel");
			}
			if (input.equals("3")) {
				System.out.println("The " + jet[2].getModel() + "take's flight..");
				System.out.println();
				System.out.println(jet[0] + "");
						// print specs of the jet here^^^^^
				System.out.println("The plane will be able to travel approximately " + (jet[2].getRange() / jet[2].getSpeed()) + " miles before needing to refuel");
			}
			if (input.equals("4")) {
				System.out.println("The " + jet[3].getModel() + "take's flight..");
				System.out.println();
				System.out.println(jet[0] + "");
						// print specs of the jet here^^^^^
						System.out.println("The plane will be able to travel approximately " + (jet[3].getRange() / jet[3].getSpeed()) + " miles before needing to refuel");
			}
			if (input.equals("5")) {
				System.out.println("The " + jet[4].getModel() + "take's flight..");
				System.out.println();
				System.out.println(jet[0] + "");
						// print specs of the jet here^^^^^
						System.out.println("The plane will be able to travel approximately " + (jet[4].getRange() / jet[4].getSpeed()) + " miles before needing to refuel");
			}
			if (input.equals("Quit")) {
				displayUserMenu();
				break;
			}
			else {
				System.out.print("Error, please enter a valid response: ");
				scanner.next();
			}
		}
