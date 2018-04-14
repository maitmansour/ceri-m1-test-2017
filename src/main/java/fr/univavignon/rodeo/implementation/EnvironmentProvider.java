package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

public class EnvironmentProvider implements IEnvironmentProvider{

	
	private ArrayList<IEnvironment> environments;

	public EnvironmentProvider(ArrayList<IEnvironment> _environments) {
		environments =new ArrayList<IEnvironment>();
		environments = _environments;
	}
	public List<String> getAvailableEnvironments() {
		List<String> av_environments = new ArrayList<String>();
		
		for (IEnvironment environment : environments) {
			av_environments.add(environment.getName());
		}
		return av_environments;
	}

	public IEnvironment getEnvironment(String name) throws IllegalArgumentException {
		if (name==null) throw new IllegalArgumentException();
		IEnvironment environment_return =null;
		for (IEnvironment environment : environments) {
			if (environment.getName().equals(name)) {
				environment_return=environment;
			}
		}
		return environment_return;
	}

}
