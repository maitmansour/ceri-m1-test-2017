package fr.univavignon.rodeo;


import org.junit.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import fr.univavignon.rodeo.api.INamedObject;


public class INamedObjectTest {
	
	/**
	 * get INamedObject Mock
	 * @return
	 */
	public static INamedObject getINamedObjectMock() {
		return  mock(INamedObject.class);
	}	
	
	@Test
	public void testGetName() {
		//Create mock
		INamedObject namedObjectTest = getINamedObjectMock();
		
		 // defining the value of getName
        when(namedObjectTest.getName()).thenReturn("myName");

        //testing getName()
        assertEquals(namedObjectTest.getName(), "myName");

	}
}
