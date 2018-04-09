package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

public class EnvironmentProvider implements IEnvironmentProvider{

	
	private ArrayList<Environment> environments;

	public EnvironmentProvider(ArrayList<Environment> _environments) {
		environments =new ArrayList<Environment>();
		environments = _environments;
	}
	public List<String> getAvailableEnvironments() {
		List<String> av_environments = new ArrayList<String>();
		
		for (Environment environment : environments) {
			av_environments.add(environment.getName());
		}
		return av_environments;
	}

	public IEnvironment getEnvironment(String name) throws IllegalArgumentException {
		if (name==null) throw new IllegalArgumentException();
		for (Environment environment : environments) {
			if (environment.getName().equals(name)) {
				return environment;
			}
		}
		return null;
	}

}
