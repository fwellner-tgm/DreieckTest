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
	public void TestIstDreieckFalseUndABFalseUndBCFalse() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);

		assertFalse(dreieck.gleichSeitig());
	}

	@Test
	public void TestIstDreieckFalseUndABFalseUndBCTrue() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(2);

		assertFalse(dreieck.gleichSeitig());
	}

	@Test
	public void TestIstDreieckFalseUndABTrueUndBCFalse() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(3);

		assertFalse(dreieck.gleichSeitig());
	}

	@Test
	public void TestIstDreieckFalseUndABTrueUndBCTrue() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);

		assertFalse(dreieck.gleichSeitig());
	}

	@Test
	public void TestIstDreieckTrueUndABFalseUndBCFalse() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);

		assertTrue(dreieck.gleichSeitig());
	}

	@Test
	public void TestIstDreieckTrueUndABFalseUndBCTrue() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(2);

		assertTrue(dreieck.gleichSeitig());
	}

	@Test
	public void TestIstDreieckTrueUndABTrueUndBCFalse() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);

		assertTrue(dreieck.gleichSeitig());
	}

	@Test
	public void TestIstDreieckTrueUndABTrueUndBCTrue() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);

		assertTrue(dreieck.gleichSeitig());
	}

}
