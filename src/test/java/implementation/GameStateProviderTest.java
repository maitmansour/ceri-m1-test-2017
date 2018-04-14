package implementation;

import fr.univavignon.rodeo.IGameStateProviderTest;
import fr.univavignon.rodeo.api.IGameStateProvider;
import fr.univavignon.rodeo.implementation.GameStateProvider;

public class GameStateProviderTest extends IGameStateProviderTest{
	@Override
	public IGameStateProvider getIGameStateProviderInstance() {
		return new GameStateProvider();
	}
}
