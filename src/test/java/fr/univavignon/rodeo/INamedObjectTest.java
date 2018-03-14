package fr.univavignon.rodeo;


import org.junit.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import fr.univavignon.rodeo.api.INamedObject;


public class INamedObjectTest {
	
	@Test
	public void testGetName() {
		//Create mock
		INamedObject namedObjectTest = mock(INamedObject.class);
		
		 // defining the value of getName
        when(namedObjectTest.getName()).thenReturn("myName");

        //testing getName()
        assertEquals(namedObjectTest.getName(), "myName");

	}
}
