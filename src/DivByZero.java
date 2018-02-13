import static org.junit.Assert.*;

import org.junit.Test;

public class DivByZero {

	@Test
	public void test() {
		Model a = new Model();
		int result = (int) a.div(5,0);
	
	}

}
