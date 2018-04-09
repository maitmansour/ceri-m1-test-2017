package implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.IEnvironmentTest;
import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.implementation.Animal;
import fr.univavignon.rodeo.implementation.Environment;
import fr.univavignon.rodeo.implementation.Specie;

public class EnvironmentTest extends IEnvironmentTest{

	@Override
	public IEnvironment getIEnvironmentInstance() {
		List<IAnimal> animals = new ArrayList<IAnimal>();
		animals.add(new Animal("test",1,true,true,false));				
		List<ISpecie> species = new ArrayList<ISpecie>();
		species.add(new Specie("myName",10,animals));
		return new Environment( "myName", 1, species) ;
	}
}
