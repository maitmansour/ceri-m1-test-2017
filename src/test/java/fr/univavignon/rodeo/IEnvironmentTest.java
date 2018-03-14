package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

public class IEnvironmentTest {

	public IEnvironment iEnvironment;

	
	/**
	 * get IEnvironement Mock
	 * @return
	 */
	public static IEnvironment getIEnvironmentMock() {
		return  mock(IEnvironment.class);
	}
	
	/**
	 * Testing of Get Areas
	 */
	@Test
	public void testGetAreas() {
		// init IEnvironment
		iEnvironment=getIEnvironmentMock();
		
		// defining the value of Areas
        when(iEnvironment.getAreas()).thenReturn(1);
        
        //test the getXP
        assertEquals(iEnvironment.getAreas(), 1);
	}	
	
	/**
	 * Testing Get Species
	 */
	@Test
	public void testGetSpecies() {
		// init IEnvironment
		iEnvironment=getIEnvironmentMock();
		
        
		List<ISpecie> species = new ArrayList<ISpecie>();

		// defining the value of Species
        when(iEnvironment.getSpecies()).thenReturn(species);
        
        //test the getSpecies
        assertEquals(iEnvironment.getSpecies(), species);
	}

}
