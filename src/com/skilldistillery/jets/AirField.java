package com.skilldistillery.jets;

public class AirField {
	private Jet[] jets;
	private static int MAX_JETS = 10;
	
	Jet[] fighterJets = new fighterJets();
	
	public void addJet(Jet jet) {
		for (int i =0; i < jets.length; i++) {
			Jet j = jets[i];
			if (j == null) {
				jets[i] = jet;
				System.out.println("Jet parked in hanger: " + i);
				break;
			}
		}
	}
		public Jet[] AirField() {
			jets = new Jet[MAX_JETS];
			return jets;
		}
	
}
