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
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight");
		System.out.println("7. Add a jet to fleet");
		System.out.println("8. Quit");
		String input = sc.next();
		
		if (input.equals("1")) {
			System.out.println(AirField());
		}
		if (input.equals("2")) {
			fly();
		}
		if (input.equals("3")) {
			fastestJet();
		}
		if (input.equals("4")) {
			longestRange();
		}
		if (input.equals("5")) {
			loadCargoJets();
		}
		if (input.equals("6")) {
			dogfight();
		}
		if (input.equals("7")) {
			addJet();
		}
		if (input.equals("8")) {
			break;
		}
			

		
		
	
	}
	
	
	
	
}
