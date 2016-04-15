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
	public void TestIstDreieckGleichSeitig() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);

		assertTrue(dreieck.gleichSeitig());

	}

}
