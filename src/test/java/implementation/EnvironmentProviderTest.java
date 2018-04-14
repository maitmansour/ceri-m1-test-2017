package implementation;

import java.util.ArrayList;

import fr.univavignon.rodeo.IEnvironmentProviderTest;
import fr.univavignon.rodeo.IEnvironmentTest;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;
import fr.univavignon.rodeo.implementation.EnvironmentProvider;

public class EnvironmentProviderTest extends IEnvironmentProviderTest{

	@Override
	public IEnvironmentProvider getIEnvironmentProviderInstance() {
		
		ArrayList<IEnvironment> _environments;
		_environments = new ArrayList<IEnvironment>();
		_environments.add(IEnvironmentTest.getIEnvironmentMock());
		return new EnvironmentProvider(_environments);
	}
}
