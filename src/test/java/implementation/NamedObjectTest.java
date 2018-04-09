package implementation;

import fr.univavignon.rodeo.INamedObjectTest;
import fr.univavignon.rodeo.api.INamedObject;
import fr.univavignon.rodeo.implementation.NamedObject;

public class NamedObjectTest extends INamedObjectTest{
	
	@Override
	public  INamedObject getINamedObjectInstance() {
		return  new NamedObject("myName");
	}
	
}
