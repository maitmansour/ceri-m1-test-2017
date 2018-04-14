package fr.univavignon.rodeo;
import org.junit.Test;

import fr.univavignon.rodeo.api.SpecieLevel;

public class SpecieLevelTest {
	//Perfection ?
	@Test
	public void testSpecieLevel(){
		SpecieLevel.valueOf(SpecieLevel.NOVICE.toString());
		SpecieLevel.valueOf(SpecieLevel.WRANGLER.toString());
		SpecieLevel.valueOf(SpecieLevel.CHAMPION.toString());
		SpecieLevel.valueOf(SpecieLevel.MASTER.toString());		
		SpecieLevel.MASTER.getRequiredXP();		
	}

}
