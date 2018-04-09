package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.*;

public class Animal implements IAnimal{

	private String name;
	private boolean boss,endangered,secret;
	private int xp;
	
	public Animal(String _name, int _xp,boolean _boss,boolean _endangered,boolean _secret) {
		name =_name;
		xp=_xp;
		boss=_boss;
		endangered=_endangered;
		secret=_secret;
	}
	
	public String getName() {
		return name;
	}

	public int getXP() {
		return xp;
	}

	public boolean isSecret() {
		return secret;
	}

	public boolean isEndangered() {
		return endangered;
	}

	public boolean isBoss() {
		return boss;
	}

}
