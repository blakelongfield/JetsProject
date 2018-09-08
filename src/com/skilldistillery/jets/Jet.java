package com.skilldistillery.jets;

import java.util.Scanner;

public abstract class Jet(String , double, int, long ) {
	private String model;
	private double speed;
	private int range;
	private long price;

	public void fly() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which plane would you like to fly?");
		System.out.println("1. " + jet[0].model);
		System.out.println("2. " + jet[1].model);
		System.out.println("3. " + jet[2].model);
		System.out.println("4. " + jet[3].model);
		System.out.println("5. " + jet[4].model);
		System.out.println("Quit");
		String input = scanner.nextLine();
		
		if (input.equals("1")) {
			System.out.println("The " + jet[0].model + "take's flight..");
			System.out.println();
			System.out.println(jet[0] + "");
				// print specs of the jet here^^^^^
					System.out.println("That means this plane can travel at approximately " + getSpeedInMach(jet[0].mph) + "machs");
			System.out.println("The plane will be able to travel approximately " + (jet[0].range / jet[0].speed) + " before needing to refuel");
		}
		if (input.equals("2")) {
			System.out.println("The " + jet[1].model + "take's flight..");
			System.out.println();
			System.out.println(jet[0] + "");
					// print specs of the jet here^^^^^
					System.out.println("That means this plane can travel at approximately " + getSpeedInMach(jet[1].mph) + "machs");
					System.out.println("The plane will be able to travel approximately " + (jet[1].range / jet[1].speed) + " before needing to refuel");
		}
		if (input.equals("3")) {
			System.out.println("The " + jet[2].model + "take's flight..");
			System.out.println();
			System.out.println(jet[0] + "");
					// print specs of the jet here^^^^^
			System.out.println("That means this plane can travel at approximately " + getSpeedInMach(jet[2].mph) + "machs");		
			System.out.println("The plane will be able to travel approximately " + (jet[2].range / jet[2].speed) + " before needing to refuel");
		}
		if (input.equals("4")) {
			System.out.println("The " + jet[3].model + "take's flight..");
			System.out.println();
			System.out.println(jet[0] + "");
					// print specs of the jet here^^^^^
					System.out.println("That means this plane can travel at approximately " + getSpeedInMach(jet[3].mph) + "machs");
					System.out.println("The plane will be able to travel approximately " + (jet[3].range / jet[3].speed) + " before needing to refuel");
		}
		if (input.equals("5")) {
			System.out.println("The " + jet[4].model + "take's flight..");
			System.out.println();
			System.out.println(jet[0] + "");
					// print specs of the jet here^^^^^
					System.out.println("That means this plane can travel at approximately " + getSpeedInMach(jet[4].mph) + "machs");
					System.out.println("The plane will be able to travel approximately " + (jet[4].range / jet[4].speed) + " before needing to refuel");
		}
		if (input.equals("Quit")) {
			displayUserMenu();
			break;
		}
		else {
			System.out.print("Error, please enter a valid response: ");
			scanner.next();
		}
		
		/*jets[0] = new FighterJet("F22", 1_498, 1839, 150_000_000);
		jets[1] = new FighterJet("F35", 1550, 1200, 95_000_000);
		jets[2] = new FighterJet("F15", 1656, 2992, 100_000_000);
		jets[3] = new FighterJet("F16", 1500, 2622, 19_000_000);
		jets[4] = new FighterJet("J10", 1446, 1150, 190_000_000);
	*/
	}


	public double getSpeedInMach(double mph) {
	double mach = 0.0013;
	double speedInMach = mph * mach;
	return speedInMach;
	}
}