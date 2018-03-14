package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

import fr.univavignon.rodeo.IEnvironmentTest;

public class IEnvironmentProviderTest {

	/**
	 * get IEnvironement Mock
	 * @return
	 */
	public static IEnvironmentProvider getIEnvironmentProviderMock() {
		return  mock(IEnvironmentProvider.class);
	}

	private IEnvironmentProvider iEnvironmentProvider;
	
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
