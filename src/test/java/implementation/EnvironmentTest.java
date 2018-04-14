package implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.IAnimalTest;
import fr.univavignon.rodeo.IEnvironmentTest;
import fr.univavignon.rodeo.ISpecieTest;
import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.implementation.Environment;

public class EnvironmentTest extends IEnvironmentTest{

	@Override
	public IEnvironment getIEnvironmentInstance() {
		List<IAnimal> animals = new ArrayList<IAnimal>();
		animals.add(IAnimalTest.getIAnimalMock());				
		List<ISpecie> species = new ArrayList<ISpecie>();
		species.add(ISpecieTest.getISpecieMock());
		return new Environment( "myName", 1, species) ;
	}
}
