package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

import fr.univavignon.rodeo.IEnvironmentTest;

public class IEnvironmentProviderTest {
	private IEnvironmentProvider iEnvironmentProvider;

	/**
	 * get IEnvironement Mock
	 * @return
	 */
	public static IEnvironmentProvider getIEnvironmentProviderMock() {
		return  mock(IEnvironmentProvider.class);
	}

	
	/**
	 * IllegalArgumentException If the given <tt>name</tt> is null.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetEnvironmentNotFound(){ 
		
		iEnvironmentProvider=getIEnvironmentProviderMock();
		doThrow(new IllegalArgumentException()).when(iEnvironmentProvider).getEnvironment(null);
		iEnvironmentProvider.getEnvironment(null);    
        
	}	
	
	/**
	 * return nothing
	 */
	@Test
	public void testGetEnvironmentFound(){ 
		
		iEnvironmentProvider=getIEnvironmentProviderMock();
		IEnvironment iEnvironment=IEnvironmentTest.getIEnvironmentMock();
        when(iEnvironmentProvider.getEnvironment("envtest")).thenReturn(iEnvironment);
        assertEquals(iEnvironmentProvider.getEnvironment("envtest"), iEnvironment);
	}
	
	/**
	 * Testing of Get Areas
	 */
	@Test
	public void testGetAreas() {
		// init IEnvironment
		iEnvironmentProvider=getIEnvironmentProviderMock();
		
		IEnvironment environment =IEnvironmentTest.getIEnvironmentMock();
		
		// defining the value of getEnvironment
        when(iEnvironmentProvider.getEnvironment("nametest")).thenReturn(environment);
        
        //test the getEnvironment
        assertEquals(iEnvironmentProvider.getEnvironment("nametest"), environment);
	}
	
	/**
	 * Testing of getAvailableEnvironments
	 */
	@Test
	public void testGetAvailableEnvironments() {
		// init IEnvironment
		iEnvironmentProvider=getIEnvironmentProviderMock();
		
		List<String> environments =  new ArrayList<String>();
		// defining the value of getAvailableEnvironments
        when(iEnvironmentProvider.getAvailableEnvironments()).thenReturn(environments);
        
        //test the getEnvironment
        assertEquals(iEnvironmentProvider.getAvailableEnvironments(), environments);
	}
}
