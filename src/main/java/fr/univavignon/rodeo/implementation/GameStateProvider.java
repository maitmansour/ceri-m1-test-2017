package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;

public class GameStateProvider implements IGameStateProvider{

	private ArrayList<IGameState> iGameStates;
	
	public GameStateProvider() {
		iGameStates= new ArrayList<IGameState>();
	}
	public void save(IGameState gameState) {
		;
		//TODO : Add real GameState
	}

	public IGameState get(String name) throws IllegalArgumentException {
		if (name==null) throw new IllegalArgumentException();
		for (IGameState iGameState : iGameStates)
			if (iGameState.getName().equals(name))
				return iGameState;
		
		IGameState tmp = new GameState("myName");
		iGameStates.add(tmp);
		return tmp;
	}

}
