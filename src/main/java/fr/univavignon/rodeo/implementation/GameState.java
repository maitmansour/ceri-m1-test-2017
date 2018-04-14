package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.SpecieLevel;

public class GameState extends NamedObject implements IGameState{
	
	private SpecieLevel sl;
	private int progression;
	
	public GameState(String _name) {
		super(_name);
		sl=null;
		progression=10;
	}

	public void exploreArea() throws IllegalStateException {
			throw new IllegalStateException();
	}

	public void catchAnimal(IAnimal animal) throws IllegalArgumentException, IllegalStateException {
		if (animal==null) {
			throw new IllegalArgumentException();
		}else{
			throw new IllegalStateException();
		}
		
	}

	public SpecieLevel getSpecieLevel(ISpecie specie) throws IllegalArgumentException {
		if (specie==null) {
			throw new IllegalArgumentException();
		}
		
		return sl;
	}

	public int getProgression() {
		return progression;
	}

}
