package com.skilldistillery.jets;

import java.util.Scanner;

public class AirField {
	private Jet[] hangar = new Jet[100];
	private int jetCount;
	int counter = 0;
	
	public AirField() {
	}

	public void addJet(Jet newJet) {
		for(int i = 0; i < hangar.length; i++) {
			if (hangar[i] == null) {
				hangar[i] = newJet;
				break;
			}
		}
	}

	public void airField() {

		if (counter <= hangar.length) {
			for (int i = 0; i < hangar.length; i++) {
				Jet j = hangar[i];
				if (j == null) {
					break;
			}
				System.out.println(hangar[i]);
				counter++;
		}
	}
}
	public void flyAllJets(Jet[] jet) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which jet in the hangar would you like to fly?");
		System.out.println("1. " + jet[0].getModel());
		System.out.println("2. " + jet[1].getModel());
		System.out.println("3. " + jet[2].getModel());
		System.out.println("4. " + jet[3].getModel());
		System.out.println("5. " + jet[4].getModel());
		System.out.println("Press any other key to return to main menu.");
		System.out.print(">: ");
		String input = scanner.next();
		
		if (input.equals("1")) {
			System.out.println("The " + jet[0].getModel() + " takes flight..");
			System.out.println();
			System.out.println(jet[0]);
			System.out.println("The plane will be able to travel approximately " + ((float)(jet[0].getRange() / jet[0].getSpeed())) + " hours before needing to refuel");
			System.out.println();
		}
		if (input.equals("2")) {
			System.out.println("The " + jet[1].getModel() + " takes flight..");
			System.out.println();
			System.out.println(jet[1]);
					System.out.println("The plane will be able to travel approximately " + ((float)(jet[1].getRange() / jet[1].getSpeed())) + " hours before needing to refuel");
					System.out.println();
		}
		if (input.equals("3")) {
			System.out.println("The " + jet[2].getModel() + " takes flight..");
			System.out.println();
			System.out.println(jet[2]);
			System.out.println("The plane will be able to travel approximately " + ((float)(jet[2].getRange() / jet[2].getSpeed())) + " hours before needing to refuel");
			System.out.println();
		}
		if (input.equals("4")) {
			System.out.println("The " + jet[3].getModel() + " takes flight..");
			System.out.println();
			System.out.println(jet[3]);
					System.out.println("The plane will be able to travel approximately " + ((float)(jet[3].getRange() / jet[3].getSpeed())) + " hours before needing to refuel");
					System.out.println();
		}
		if (input.equals("5")) {
			System.out.println("The " + jet[4].getModel() + " takes flight..");
			System.out.println();
			System.out.println(jet[4]);
					System.out.println("The plane will be able to travel approximately " + ((float)(jet[4].getRange() / jet[4].getSpeed())) + " hours before needing to refuel");
					System.out.println();
		}
		if ((input.equals("B") || input.equals("b") || input.equals("back") || input.equals("BACK")))
			return;
		{
		}
	}

	public void loadCargo() {
		for( Jet jet : hangar ) { 
			if (jet != null) {
				if (jet instanceof CargoCarrier) {
					((CargoCarrier)jet).loadCargo();
				}
			}
		}
			
	}
	public void prepareForBattle() {
		for (Jet jet : hangar) {
			if (jet != null) {
				if (jet instanceof FighterJet) {
					((FighterJet)jet).prepareForBattle();
				}
			}
		}
		
	}

	public Jet[] getHangar() {
		return hangar;
	}

	public void setHangar(Jet[] hangar) {
		this.hangar = hangar;
	}

	public int getJetCount() {
		return jetCount;
	}

	public void setJetCount(int jetCount) {
		this.jetCount = jetCount;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

}