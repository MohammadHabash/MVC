import static org.junit.Assert.*;

import org.junit.Test;

public class subTest {

	@Test
	public void test() {
		Model m=new Model();
		int result = (int) m.sub(5,5);
	assertEquals(0,	result);
	
	}

}
