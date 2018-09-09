package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {
	String model;
	
	
	public FighterJet() {
	}
	
	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void prepareForBattle() {
		System.out.println(this.getModel());
		
	}


}




