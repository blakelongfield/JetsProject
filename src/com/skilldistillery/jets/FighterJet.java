package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {
	String model;
	
	
	FighterJet fighterJet = new FighterJet();
	
	public FighterJet() {
	}
	public FighterJet(String model, int mph, int range, long price) {
	}

	public FighterJet(FighterJet fighterJet) {
		super();
		this.fighterJet = fighterJet;
	}

	@Override
	public void flight() {
		
	}

	public FighterJet getFighterJet() {
		return fighterJet;
	}

	public void setFighterJet(FighterJet fighterJet) {
		this.fighterJet = fighterJet;
	}

	@Override
	public String toString() {
		return "FighterJet [fighterJet=" + fighterJet + "]";
	}

}




