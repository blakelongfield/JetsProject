package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {


public FighterJet() {
	}

public FighterJet(Jet f_22, Jet f_35, Jet f_15) {
	super();
	this.F_22 = f_22;
	this.F_35 = f_35;
	this.F_15 = f_15;
}
Jet F_22 = new FighterJet();
Jet F_35 = new FighterJet();
Jet F_15 = new FighterJet();

@Override
public void flight() {
	
}

public Jet getF_22() {
	return F_22;
}

public void setF_22(Jet f_22) {
	F_22 = f_22;
}

public Jet getF_35() {
	return F_35;
}

public void setF_35(Jet f_35) {
	F_35 = f_35;
}

public Jet getF_15() {
	return F_15;
}

public void setF_15(Jet f_15) {
	F_15 = f_15;
}

@Override
public String toString() {
	return "FighterJet [F_22=" + F_22 + ", F_35=" + F_35 + ", F_15=" + F_15 + "]";
}
}
