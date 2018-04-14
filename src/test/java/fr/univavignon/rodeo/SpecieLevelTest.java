package fr.univavignon.rodeo;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.univavignon.rodeo.api.SpecieLevel;

public class SpecieLevelTest {
	//Perfection ?
	@Test
	public void testSpecieLevel(){
		assertEquals("NOVICE",SpecieLevel.NOVICE.toString());
		SpecieLevel.valueOf(SpecieLevel.WRANGLER.toString());
		SpecieLevel.valueOf(SpecieLevel.CHAMPION.toString());
		SpecieLevel.valueOf(SpecieLevel.MASTER.toString());		
		SpecieLevel.MASTER.getRequiredXP();		
	}

}
