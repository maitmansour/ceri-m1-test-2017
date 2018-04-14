package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;

import org.junit.Test;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.SpecieLevel;

public class IGameStateTest {

public static IGameState iGameState;
public static IAnimal iAnimal=IAnimalTest.getIAnimalMock();
	
	/**
	 * get IGameStateTest Mock
	 * @return
	 */
	public static IGameState getIGameStateMock() {
		iGameState=mock(IGameState.class);
		
		
		doThrow(new IllegalStateException()).when(iGameState).exploreArea();
		doThrow(new IllegalArgumentException()).when(iGameState).catchAnimal(null);		
		
		doThrow(new IllegalArgumentException()).when(iGameState).getSpecieLevel(null);
		ISpecie iSpecie=ISpecieTest.getISpecieMock();
		doThrow(new IllegalStateException()).when(iGameState).catchAnimal(iAnimal);

		
		SpecieLevel specieLevel = null ;
        when(iGameState.getSpecieLevel(iSpecie)).thenReturn(specieLevel);
		
		 // defining the value of getArea
       when(iGameState.getProgression()).thenReturn(10);


		return  iGameState;
	}
	
	
	/**
	 * get IGameStateTest Instance
	 * @return
	 */
	public IGameState getIGameStateInstance() {
		return  getIGameStateMock();
	}
	
	@Test(expected = IllegalStateException.class)
	public void testExploreAreaException(){ 
		
		// init IGameStateTest
		iGameState=getIGameStateMock();
		
		iGameState.exploreArea();
        
        
	}

	
	/**
	 *  IllegalArgumentException If the given <tt>animal</tt> is <tt>null</tt>.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCatchAnimalNull(){ 
		
		iGameState=getIGameStateInstance();
		iGameState.catchAnimal(null);    
        
	}
	
	/**
	 * IllegalStateException If the given <tt>animal</tt> can not be found in current areas.
	 */
	@Test(expected = IllegalStateException.class)
	public void testCatchAnimalNotFound(){ 
		iGameState=getIGameStateInstance();
		iGameState.catchAnimal(iAnimal);    
	}	

	
	/**
	 * IllegalArgumentException If the given <tt>specie</tt> is <tt>null</tt>
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetSpecieLevelException(){ 
		
		iGameState=getIGameStateInstance();
		iGameState.getSpecieLevel(null);    
        
	}	
	
	/**
	 *  Current specie level.
	 */
	@Test
	public void testGetSpecieLevel(){ 
		
		iGameState=getIGameStateInstance();
		SpecieLevel specieLevel = null ;
		ISpecie iSpecie=ISpecieTest.getISpecieMock();
        assertEquals(iGameState.getSpecieLevel(iSpecie), specieLevel);
        
	}
	
	/**
	 * testing get progression
	 */
	@Test
	public void testGetProgression() {
		//Create mock
		iGameState=getIGameStateInstance();

        //testing getArea()
        assertEquals(iGameState.getProgression(), 10);

	}
}

