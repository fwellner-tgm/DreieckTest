package dreieck;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestIstDreieck {

	private Dreieck dreieck;

	int seite_a;
	int seite_b;
	int seite_c;

	@Before
	public void setUp() throws Exception {
		dreieck = new Dreieck(seite_a, seite_b, seite_c);
	}

	@Test
	public void istDreieckSeiteANull() {
		dreieck.setSeite_a(0);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);

		assertFalse(dreieck.istDreieck());
	}

	@Test
	public void istDreieckSeiteBNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(0);
		dreieck.setSeite_c(2);

		assertFalse(dreieck.istDreieck());
	}

	@Test
	public void istDreieckSeiteCNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(0);

		assertFalse(dreieck.istDreieck());
	}

	@Test
	public void istDreieckSeiteAKleinerNull() {
		dreieck.setSeite_a(-1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);

		assertFalse(dreieck.istDreieck());
	}

	@Test
	public void istDreieckSeiteBKleinerNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(-1);
		dreieck.setSeite_c(2);

		assertFalse(dreieck.istDreieck());
	}

	@Test
	public void istDreieckSeiteCKleinerNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(-1);

		assertFalse(dreieck.istDreieck());
	}

	@Test
	public void istDreieckSeiteAPlusSeiteBGleichC() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);

		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteAPlusSeiteCGleichB() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_c(2);
		dreieck.setSeite_b(3);

		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteCPlusSeiteBGleichA() {
		dreieck.setSeite_c(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_a(3);

		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteAPlusSeiteBKleinerNull() {
		dreieck.setSeite_a(Integer.MAX_VALUE-1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(1);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteBPlusSeiteCKleinerNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(Integer.MAX_VALUE-1);
		dreieck.setSeite_c(2);

		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteAPlusSeiteCKleinerNull() {
		dreieck.setSeite_a(Integer.MAX_VALUE-1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);

		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteAPlusSeiteBKleinerC() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(4);

		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteAPlusSeiteCKleinerB() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(4);
		dreieck.setSeite_c(2);

		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteCPlusSeiteBKleinerA() {
		dreieck.setSeite_a(4);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(1);

		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckTrue() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);


		assertTrue(dreieck.istDreieck());
	}


	@After
	public void tearDown() throws Exception {
	}

}
