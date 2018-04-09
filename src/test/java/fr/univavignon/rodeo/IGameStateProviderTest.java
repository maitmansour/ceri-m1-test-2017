package fr.univavignon.rodeo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;

public class IGameStateProviderTest {
	public IGameStateProvider iGameStateProvider;

	/**
	 * get IGameStateProvider Mock
	 * @return
	 */
	public static IGameStateProvider getIGameStateProviderMock() {
		return  mock(IGameStateProvider.class);
	}
	
	/**
	 * Saves the given <tt>gameState</tt>.
	 */
	@Test
	public void testSave(){ 
		
		iGameStateProvider=getIGameStateProviderMock();
		IGameState iGameState=IGameStateTest.getIGameStateMock();
        doNothing().when(iGameStateProvider).save(iGameState);
        iGameStateProvider.save(iGameState);    
        
	}	

	
	/**
	 * IllegalArgumentException If the given <tt>name</tt> is null.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetNull(){ 
		
		iGameStateProvider=getIGameStateProviderMock();
		doThrow(new IllegalArgumentException()).when(iGameStateProvider).get(null);
		iGameStateProvider.get(null);    
        
	}	
	
	/**
	 * return nothing
	 */
	@Test
	public void testGet(){ 
		
		iGameStateProvider=getIGameStateProviderMock();
		IGameState iGameState=IGameStateTest.getIGameStateMock();
        when(iGameStateProvider.get("gageStatetest")).thenReturn(iGameState);
        assertEquals(iGameStateProvider.get("gageStatetest"), iGameState);
	}

	
}
