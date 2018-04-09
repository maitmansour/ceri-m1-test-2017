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
		 // defining the value of getName
		INamedObject namedObjectTest = mock(INamedObject.class);
        when(namedObjectTest.getName()).thenReturn("myName");
		return  namedObjectTest;
	}	
	
	/**
	 * get INamedObject Mock
	 * @return
	 */
	public  INamedObject getINamedObjectInstance() {
		return  getINamedObjectMock();
	}
	
	@Test
	public void testGetName() {
		//Create mock
		INamedObject namedObjectTest = getINamedObjectInstance();
		

        //testing getName()
        assertEquals(namedObjectTest.getName(), "myName");

	}
}
