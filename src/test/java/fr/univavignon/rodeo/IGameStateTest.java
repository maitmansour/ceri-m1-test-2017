package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.doNothing;

import org.junit.Test;

import fr.univavignon.rodeo.api.IAnimal;
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
	
	/**
	 * Test Explore Area no exception will be thrown
	 */
	@Test
	public void testExploreArea(){ 
		
		// init IGameStateTest
		iGameState=getIGameStateMock();
        doNothing().when(iGameState).exploreArea();
		iGameState.exploreArea();
        
        
	}
	
	/**
	 *  IllegalArgumentException If the given <tt>animal</tt> is <tt>null</tt>.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCatchAnimalNull(){ 
		
		iGameState=getIGameStateMock();
		doThrow(new IllegalArgumentException()).when(iGameState).catchAnimal(null);
		iGameState.catchAnimal(null);    
        
	}
	
	/**
	 * IllegalStateException If the given <tt>animal</tt> can not be found in current areas.
	 */
	@Test(expected = IllegalStateException.class)
	public void testCatchAnimalNotFound(){ 
		
		iGameState=getIGameStateMock();
		IAnimal iAnimal=IAnimalTest.getIAnimalMock();
		doThrow(new IllegalStateException()).when(iGameState).catchAnimal(iAnimal);
		iGameState.catchAnimal(iAnimal);    
        
	}	
	
	/**
	 * return nothing
	 */
	@Test
	public void testCatchAnimalFound(){ 
		
		iGameState=getIGameStateMock();
		IAnimal iAnimal=IAnimalTest.getIAnimalMock();
        doNothing().when(iGameState).catchAnimal(iAnimal);
		iGameState.catchAnimal(iAnimal);

        
	}
}
