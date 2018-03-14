package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

public class ISpecieTest {

	/**
	 * get ISpecie Mock
	 * @return
	 */
	public static ISpecie getISpecieMock() {
		return  mock(ISpecie.class);
	}	
	
	/**
	 * testing get Area
	 */
	@Test
	public void testGetArea() {
		//Create mock
		ISpecie iSpecie = getISpecieMock();
		
		 // defining the value of getArea
        when(iSpecie.getArea()).thenReturn(10);

        //testing getArea()
        assertEquals(iSpecie.getName(), 1);

	}	
	
	/**
	 * testing get Animals
	 */
	@Test
	public void testGetAnimals() {
		//Create mock
		ISpecie iSpecie = getISpecieMock();
		
		//Creating List of Animals
		
		List<IAnimal> animals = new ArrayList<IAnimal>();
		
		 // defining the value of getAnimals
        when(iSpecie.getAnimals()).thenReturn(animals);

        //testing getAnimals()
        assertEquals(iSpecie.getAnimals(), animals);

	}
}
