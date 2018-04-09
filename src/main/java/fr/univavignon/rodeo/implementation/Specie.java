package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

public class Specie extends NamedObject implements ISpecie {

	private List<IAnimal> animals;
	private int area;

	public Specie(String _name,int _area,List<IAnimal> _animals) {
		super(_name);
		animals =new ArrayList<IAnimal>();
		area=_area;
		animals.addAll(_animals);
	}

	public int getArea() {
		return area;
	}

	public List<IAnimal> getAnimals() {
		return animals;
	}

}
