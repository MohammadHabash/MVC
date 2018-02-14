import static org.junit.Assert.*;

import org.junit.Test;

public class TestTest {

	@Test
	public void test() {
		Model m=new Model();
		int result = (int) m.Mul(5,5);
	assertEquals(25,	result);
	
	}
	

}
