	import static org.junit.Assert.*;
	import org.junit.Test;
	
public class CalculateCommissionTest {
	
	private static final double DELTA = 1e-15;
	// smallest possible integer, used to set maximum variance delta
	//delta - the maximum delta between expected and actual for which both numbers are still considered equal.
	
		@Test
		//Test annotation indicates that the public void method to which it is attached can be run as a test case
		public void testCalculate1() {
			assertEquals("equivalent partition (1st commission range)", 28, CalculateCommission.Calculate(2,3,4),DELTA);
		}	
		
		@Test
		public void testCalculate2() {
			assertEquals("equivalent partition (2nd commission range)", 100.75, CalculateCommission.Calculate(9,10,12),DELTA);
		}	
		
		@Test
		public void testCalculate3() {
			assertEquals("equivalent partition (3rd commission range)", 221, CalculateCommission.Calculate(17,18,20),DELTA);
		}	
		@Test
		public void testCalculate4() {
			assertEquals("designed to fail", 999, CalculateCommission.Calculate(17,18,20),DELTA);
		}	
	}


