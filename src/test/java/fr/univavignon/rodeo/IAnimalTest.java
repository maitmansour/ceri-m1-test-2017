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
		return  mock(IAnimal.class);
	}
	
	@Test
	public void testGetXP() {
		// init iAnimal
		iAnimal=getIAnimalMock();
		
		// defining the value of XP
        when(iAnimal.getXP()).thenReturn(1);
        
        //test the getXP
        assertEquals(iAnimal.getXP(), 1);
	}

	
	@Test
	public void testIsBoss() {
		// init iAnimal
		iAnimal=getIAnimalMock();
		
		// defining the value of isBoss
        when(iAnimal.isBoss()).thenReturn(true);
        
        //test the isBoss
        assertTrue(iAnimal.isBoss());	
        }

	@Test
	public void testIsEndangered() {
		// init iAnimal
		iAnimal=getIAnimalMock();
		
		// defining the value of isEndagered
        when(iAnimal.isEndangered()).thenReturn(true);
        
        //test the isBoss
        assertTrue(iAnimal.isEndangered());		
        }

	@Test
	public void testIsSecret() {
		// init iAnimal
		iAnimal=getIAnimalMock();
		
		// defining the value of isSecret
        when(iAnimal.isSecret()).thenReturn(false);
        
        //test the isSecret
        assertFalse(iAnimal.isSecret());		
        }

}
