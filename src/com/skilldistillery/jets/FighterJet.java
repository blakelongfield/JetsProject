package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {
	String model;
	
	
	public FighterJet() {
	}
	
	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void flight() {
		
	}


}




