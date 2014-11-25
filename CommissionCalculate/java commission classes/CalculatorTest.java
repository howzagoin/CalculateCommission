import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		assertEquals("3 + 7", 10, Calculator.add(3,7));
	}
	
	@Test
	public void testSub() {
		assertEquals("7 - 3", 4, Calculator.sub(7,3));
	}
	
	@Test
	public void testSub2() {
		assertEquals("7 - 5", 4, Calculator.sub(7,5));
	}
}
