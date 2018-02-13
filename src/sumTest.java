import static org.junit.Assert.*;

import org.junit.Test;

public class sumTest {

	@Test
	public void test() {
		Model m=new Model();
		int result = (int) m.add(5,5);
	assertEquals(10,	result);
	
	}

}
