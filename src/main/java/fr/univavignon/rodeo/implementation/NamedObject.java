package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.INamedObject;

public class NamedObject implements INamedObject{
	private String name;
	public NamedObject(String _name) {
		name=_name;
	}
	public String getName() {
		return name;
	}

}
