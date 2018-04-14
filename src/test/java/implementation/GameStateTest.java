package implementation;

import fr.univavignon.rodeo.IGameStateTest;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.implementation.GameState;

public class GameStateTest extends IGameStateTest{
	@Override
	public IGameState getIGameStateInstance() {
		return new GameState("myTest");
	}
}
