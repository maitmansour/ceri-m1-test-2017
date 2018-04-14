package fr.univavignon.rodeo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;

public class IGameStateProviderTest {
	public static IGameStateProvider iGameStateProvider;
	private static 	IGameState iGameState = IGameStateTest.getIGameStateMock();;
	/**
	 * get IGameStateProvider Mock
	 * @return
	 */
	public static IGameStateProvider getIGameStateProviderMock() {
		iGameStateProvider = mock(IGameStateProvider.class);
		doThrow(new IllegalArgumentException()).when(iGameStateProvider).get(null);

        when(iGameStateProvider.get("myName")).thenReturn(iGameState);
        when(iGameStateProvider.get("myName").getName()).thenReturn("myName");
        

		IGameState iGameState_second = IGameStateTest.getIGameStateMock();
		iGameStateProvider.save(iGameState_second);
		
        when(iGameStateProvider.get("NewGameState")).thenReturn(iGameState);
        when(iGameStateProvider.get("NewGameState").getName()).thenReturn("myName");
        
		return  iGameStateProvider;
	}
	
	/**
	 * get IGameStateProvider Instance
	 * @return
	 */
	public  IGameStateProvider getIGameStateProviderInstance() {
		return  getIGameStateProviderMock();
	}
	
	
	/**
	 * IllegalArgumentException If the given <tt>name</tt> is null.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetNull(){ 
		
		iGameStateProvider=getIGameStateProviderInstance();
		iGameStateProvider.get(null);    
        
	}	
	
	/**
	 * return nothing
	 */
	@Test
	public void testGet(){ 
		
		iGameStateProvider=getIGameStateProviderInstance();
        assertEquals(iGameStateProvider.get("myName").getName(),"myName");
        assertEquals(iGameStateProvider.get("myName") instanceof IGameState,iGameState instanceof IGameState);
	}
	
	/**
	 * return nothing
	 */
	@Test
	public void testSave(){ 

		iGameStateProvider=getIGameStateProviderInstance();		
        assertEquals(iGameStateProvider.get("NewGameState").getName(),"myName");
	}

}
