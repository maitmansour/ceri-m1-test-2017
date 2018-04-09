package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Test;
import fr.univavignon.rodeo.api.IAnimal;

public class IAnimalTest {

	public IAnimal iAnimal;
	
	/**
	 * get IAnimal Mock
	 * @return
	 */
	public static IAnimal getIAnimalMock() {
		IAnimal iAnimal = mock(IAnimal.class);				
		// defining the value of XP
		when(iAnimal.getXP()).thenReturn(1);
		// init iAnimal
		// defining the value of isBoss
        when(iAnimal.isBoss()).thenReturn(true);	
		
		// defining the value of isEndagered
        when(iAnimal.isEndangered()).thenReturn(true);	
		
		// defining the value of isSecret
        when(iAnimal.isSecret()).thenReturn(false);
        
		return  iAnimal;
	}	
	
	/**
	 * get IAnimal Mock
	 * @return
	 */
	public  IAnimal getIAnimalInstance() {
		return  getIAnimalMock();
	}
	
	/**
	 * Testing Get XP
	 */
	@Test
	public void testGetXP() {
		// init iAnimal
		iAnimal=getIAnimalInstance();
        //test the getXP
        assertEquals(iAnimal.getXP(), 1);
	}

	/**
	 * Thesting Is Boss
	 */
	@Test
	public void testIsBoss() {
		// init iAnimal
		iAnimal=getIAnimalInstance();
		
        
        //test the isBoss
        assertTrue(iAnimal.isBoss());	
        }

	/**
	 * Testing Is Endangered
	 */
	@Test
	public void testIsEndangered() {
		// init iAnimal
		iAnimal=getIAnimalInstance();
        
        //test the isBoss
        assertTrue(iAnimal.isEndangered());		
        }

	@Test
	public void testIsSecret() {
		// init iAnimal
		iAnimal=getIAnimalInstance();
        
        //test the isSecret
        assertFalse(iAnimal.isSecret());		
        }

}
