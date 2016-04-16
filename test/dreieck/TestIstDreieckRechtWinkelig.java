package dreieck;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestIstDreieckRechtWinkelig {

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

		assertFalse(dreieck.rechtWinkelig());
	}

	@Test
	public void TestIstNurDreieckFalse() {
		this.dreieck.setSeite_a(0);
		this.dreieck.setSeite_b(0);
		this.dreieck.setSeite_c(0);

		assertFalse(dreieck.rechtWinkelig());
	}

	@Test
	public void TestIstABFalseUndACFalse() {
		this.dreieck.setSeite_a(2);
		this.dreieck.setSeite_b(3);
		this.dreieck.setSeite_c(4);

		assertFalse(dreieck.rechtWinkelig());
	}

	@Test
	public void TestIstABFalseUndACTrue() {
		this.dreieck.setSeite_a(3);
		this.dreieck.setSeite_b(4);
		this.dreieck.setSeite_c(2);

		assertFalse(dreieck.rechtWinkelig());
	}

	@Test
	public void TestIstABTrueUndACFalse() {
		this.dreieck.setSeite_a(2);
		this.dreieck.setSeite_b(1);
		this.dreieck.setSeite_c(3);

		assertFalse(dreieck.rechtWinkelig());
	}

	@Test
	public void TestIstABTrueUndACTrue() {
		this.dreieck.setSeite_a(5);
		this.dreieck.setSeite_b(3);
		this.dreieck.setSeite_c(4);

		assertTrue(dreieck.rechtWinkelig());
	}

	@Test
	public void TestIstBAFalseUndBCFalse() {
		this.dreieck.setSeite_a(3);
		this.dreieck.setSeite_b(2);
		this.dreieck.setSeite_c(3);

		assertFalse(dreieck.rechtWinkelig());
	}

	@Test
	public void TestIstCBFalseUndCAFalse() {
		this.dreieck.setSeite_a(3);
		this.dreieck.setSeite_b(3);
		this.dreieck.setSeite_c(2);

		assertFalse(dreieck.rechtWinkelig());
	}
}