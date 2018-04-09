package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.doNothing;

import org.junit.Test;

import fr.univavignon.rodeo.api.IGameState;

public class IGameStateTest {

public IGameState iGameState;
	
	/**
	 * get IGameStateTest Mock
	 * @return
	 */
	public static IGameState getIGameStateMock() {
		return  mock(IGameState.class);
	}
	
	@Test(expected = IllegalStateException.class)
	public void testExploreAreaException(){ 
		
		// init IGameStateTest
		iGameState=getIGameStateMock();
		
		doThrow(new IllegalStateException()).when(iGameState).exploreArea();

		iGameState.exploreArea();
        
        
	}
	
	@Test
	public void testExploreArea(){ 
		
		// init IGameStateTest
		iGameState=getIGameStateMock();
        doNothing().when(iGameState).exploreArea();
		iGameState.exploreArea();
        
        
	}
}
