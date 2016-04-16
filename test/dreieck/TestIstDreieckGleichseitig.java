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
	public void TestIstNurDreieckTrue() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(5);

		assertFalse(dreieck.gleichSeitig());
	}

	@Test
	public void TestIstNurDreieckFalse() {
		dreieck.setSeite_a(0);
		dreieck.setSeite_b(0);
		dreieck.setSeite_c(0);

		assertFalse(dreieck.gleichSeitig());
	}

	@Test
	public void TestIstABFalseUndBCFalse() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);

		assertFalse(dreieck.gleichSeitig());
	}

	@Test
	public void TestIstABFalseUndBCTrue() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(3);

		assertFalse(dreieck.gleichSeitig());
	}

	@Test
	public void TestABTrueUndBCFalse() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);

		assertFalse(dreieck.gleichSeitig());
	}

	@Test
	public void TestIstABTrueUndBCTrue() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);

		assertTrue(dreieck.gleichSeitig());
	}

}
