package implementation;

import fr.univavignon.rodeo.*;
import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.implementation.Animal;
public class AnimalTest extends IAnimalTest{
	
	@Override
	public  IAnimal getIAnimalInstance() {
		return  new Animal("test",1,true,true,false);
	}
	
}
