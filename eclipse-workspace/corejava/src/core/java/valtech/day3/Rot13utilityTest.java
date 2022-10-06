package core.java.valtech.day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Rot13utilityTest {

	@Test
	public void test() {
		assertEquals('n', Rot13utility.rotate('a'));
		assertEquals('n', Rot13utility.rotate('z'));
		assertEquals('n', Rot13utility.rotate('c'));
		assertEquals('n', Rot13utility.rotate('d'));
	}

}
