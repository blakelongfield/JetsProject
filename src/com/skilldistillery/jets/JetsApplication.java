package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {
	Scanner sc = new Scanner(System.in);

	static AirField af = new AirField();

	public static void main(String[] args) {

		Jet jet1 = new FighterJet("F22", 1498, 1839, 150_000_000);
		Jet jet2 = new FighterJet("F35", 1550, 1200, 95_000_000);
		Jet jet3 = new FighterJet("F15", 1656, 2992, 100_000_000);
		Jet jet4 = new FighterJet("F16", 1500, 2622, 19_000_000);
		Jet jet5 = new FighterJet("J10", 1446, 1150, 190_000_000);
		Jet jet6 = new CargoPlane("Boeing 747 Dreamlifter", 776, 4847, 357_000_000);
		Jet jet7 = new CargoPlane("Airbus A300 Beluga", 483, 4000, 284_000_000);
		Jet jet8 = new CargoPlane("Aero Spacelines Super Guppy", 253, 2000, 500_000_000);

		af.addJet(jet1);
		af.addJet(jet2);
		af.addJet(jet3);
		af.addJet(jet4);
		af.addJet(jet5);
		af.addJet(jet6);
		af.addJet(jet7);
		af.addJet(jet8);

		JetsApplication app = new JetsApplication();
		app.launch();
	}

	public void launch() {
		displayUserMenu();
	}

	public void displayUserMenu() {
		String input = "";

		do {
			System.out.println("1. List fleet");
			System.out.println("2. Fly all jets");
			System.out.println("3. View fastest jet");
			System.out.println("4. View jet with longest range");
			System.out.println("5. Load all Cargo Jets");
			System.out.println("6. Dogfight");
			System.out.println("7. Add a jet to the fleet");
			System.out.println("8. Exit program");
			input = sc.nextLine();

			switch (input) {
			case "1":
				af.airField();
				break;
			case "2":
				af.flyAllJets(af.getHanger());
				break;
			case "3":
				fastestJet();
				System.out.println(fastestJet());
				break;
			case "4":
				longestRange();
				System.out.println(longestRange());
				break;
			case "5":
				System.out.println("You load up....");
				af.loadCargo();
				break;
			case "6":
				//af.dogfight();
				break;
			case "7":
				System.out.println("So you want to add a jet into our hanger?");
				System.out.println("What's your jets model?");
				String model = sc.next();
				System.out.println("and how fast does it go? (in mph)");
				double speed = sc.nextDouble();
				System.out.println("and it's range? (in miles)");
				int range = sc.nextInt();
				System.out.println("and finally..it's price?");
				long price = sc.nextLong();
				JetImpl newJet = new JetImpl(model, speed, range, price);
				af.addJet(newJet);
				System.out.println(newJet);
				sc.nextLine();
				break;
			case "8":
				break;
			default:
				System.out.println("Please enter a valid response");
			}
		} while (!input.equals("8"));
		
		sc.close();
	}

	public Jet fastestJet() {
		Jet[] tempJets = af.getHanger();
		Jet fastestJet = tempJets[0];
		for (int i = 0; i < tempJets.length; i++) {
			if (tempJets[i] != null) {
				if (tempJets[i].getSpeed() > fastestJet.getSpeed()) {
					fastestJet = tempJets[i];
				}
			}
		}
		return fastestJet;
	}

	private Jet longestRange() {
		Jet[] tempJets = af.getHanger();
		Jet longestJet = tempJets[0];
		for (int i = 0; i < tempJets.length; i++) {
			if (tempJets[i] != null) {
				if (tempJets[i].getRange() > longestJet.getRange()) {
					longestJet = tempJets[i];
				}
			}
		}
		return longestJet;
	}
	
	
}
