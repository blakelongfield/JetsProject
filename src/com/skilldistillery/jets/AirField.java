package com.skilldistillery.jets;

public class AirField {

	Jet[] jets = new Jet[100];

	public Jet[] getJets() {
		return jets;
	}

	public void setJets(Jet[] jets) {
		this.jets = jets;
	}

	public void addJet(Jet jet) {
	}

	public void airField() {
		
		jets[0] = new FighterJet("F22", 1_498, 1839, 150_000_000);
		jets[1] = new FighterJet("F35", 1550, 1200, 95_000_000);
		jets[2] = new FighterJet("F15", 1656, 2992, 100_000_000);
		jets[3] = new FighterJet("F16", 1500, 2622, 19_000_000);
		jets[4] = new FighterJet("J10", 1446, 1150, 190_000_000);
		jets[5] = new CargoPlane("Boeing 747 Dreamlifter", 776, 4847, 357_000_000);
		jets[6] = new CargoPlane("Airbus A300 Beluga", 483, 4000, 284_000_000);
		jets[7] = new CargoPlane("Aero Spacelines Super Guppy", 253, 2000, 500_000_000);

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