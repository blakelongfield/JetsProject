package com.skilldistillery.jets;

public class AirField {

	Jet[] jets = new Jet[100];
	CargoPlane[] cargoPlanes = new CargoPlane[3];
	
	Allplanes[][] allplanes = new Allplanes[jets][cargoPlanes];
	
	public void addJet(Jet jet) {

	}

	public void airField() {
		jets[0] = new FighterJet("F22", 1_498, 1839, 150_000_000);
		jets[1] = new FighterJet("F35", 1550, 1200, 95_000_000);
		jets[2] = new FighterJet("F15", 1656, 2992, 100_000_000);
		jets[3] = new FighterJet("F16", 1500, 2622, 19_000_000);
		jets[4] = new FighterJet("J10", 1446, 1150, 190_000_000);

		int counter = 0;
		if (counter <= jets.length) {
			for (int i = 0; i < jets.length; i++) {
				Jet j = jets[i];
				if (j != null) {
					System.out.println("The jet parked in hanger: " + counter + " is an " + i);
					counter++;
					break;
				}
			}
		}
	}
}


