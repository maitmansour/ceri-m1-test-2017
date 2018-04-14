package implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.IAnimalTest;
import fr.univavignon.rodeo.ISpecieTest;
import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.implementation.Specie;

public class SpecieTest extends ISpecieTest{

	@Override
	public  ISpecie getISpecieInstance() {
		List<IAnimal> animals = new ArrayList<IAnimal>();
		animals.add(IAnimalTest.getIAnimalMock());
		return  new Specie("myName",10,animals) ;
	}	
}
