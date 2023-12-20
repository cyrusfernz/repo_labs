import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiDivideTest {

	 @Test
	    void testAdd() {
		 	MultiDivide objAdd = new MultiDivide();
	        int expected =8;
	        int actual =objAdd.addMethod(4, 1, 2);
	        assertEquals(expected, actual);
	    }
	 
	 @Test
		void test() {
			//fail("Not yet implemented");
		 MultiDivide objAdd = new MultiDivide();
	        int expected =2;
	        int actual =objAdd.addMethod(4, 2);
	        assertEquals(expected, actual);
		}
	
}
