package dreieck;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestIstDreieckGleichschenkelig {

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
		this.dreieck.setSeite_a(3);
		this.dreieck.setSeite_b(2);
		this.dreieck.setSeite_c(4);

		assertFalse(dreieck.gleichSchenkelig());
	}

	@Test
	public void TestIstNurDreieckFalse() {
		this.dreieck.setSeite_a(0);
		this.dreieck.setSeite_b(0);
		this.dreieck.setSeite_c(0);

		assertFalse(dreieck.gleichSchenkelig());
	}

	@Test
	public void TestIstDreieckTrueUndAGleichB() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);

		assertTrue(dreieck.gleichSchenkelig());
	}

	@Test
	public void TestIstDreieckTrueUndBGleichC() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(2);

		assertTrue(dreieck.gleichSchenkelig());
	}

	@Test
	public void TestIstDreieckTrueUndAGleichC() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(2);

		assertTrue(dreieck.gleichSchenkelig());
	}
}