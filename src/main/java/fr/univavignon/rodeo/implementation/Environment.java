package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

public class Environment extends NamedObject implements IEnvironment{

	private int areas;
	private ArrayList<ISpecie> species;

	public Environment(String _name,int _areas,List<ISpecie> _species) {
		super(_name);
		species =new ArrayList<ISpecie>();
		areas=_areas;
		species.addAll(_species);
	}

	public int getAreas() {
		return areas;
	}

	public List<ISpecie> getSpecies() {
		return species;
	}

}
