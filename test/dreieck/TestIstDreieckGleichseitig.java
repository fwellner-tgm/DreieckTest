package dreieck;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestIstDreieckGleichseitig {

	private Dreieck dreieck;

	int seite_a, seite_b, seite_c;

	@Before
	public void setUp() throws Exception {
		dreieck = new Dreieck(seite_a, seite_b, seite_c);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void istNurDreieckTrue() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(5);

		assertFalse(dreieck.gleichSeitig());
	}

	@Test
	public void istNurDreieckFalse() {
		dreieck.setSeite_a(0);
		dreieck.setSeite_b(0);
		dreieck.setSeite_c(0);

		assertFalse(dreieck.gleichSeitig());
	}

	@Test
	public void istABFalseUndBCFalse() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);

		assertFalse(dreieck.gleichSeitig());
	}

	@Test
	public void istABFalseUndBCTrue() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(3);

		assertFalse(dreieck.gleichSeitig());
	}

	@Test
	public void istABTrueUndBCFalse() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);

		assertFalse(dreieck.gleichSeitig());
	}

	@Test
	public void istABTrueUndBCTrue() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);

		assertTrue(dreieck.gleichSeitig());
	}

}
