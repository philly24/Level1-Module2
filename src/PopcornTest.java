import static org.junit.Assert.*;

import org.junit.Test;

public class PopcornTest {

	@Test
	public void test() {
		Popcorn p = new Popcorn("myflavor");
		assertEquals("myflavor", p.getFavor());
		assertTrue(5 == p.add(2, 3));
	}

}
