
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;



class GQTest {
	
	// use mvn clean, test-compile, compile, mvn test to run

	GenericQueue <Integer> test = new GenericQueue <Integer> (1) ; // used to test constructor
	static GenericQueue  <Integer> test2 = new GenericQueue <Integer> (1) ; // used to test other methods;
	static GenericQueue  <Integer> test3 = new GenericQueue <Integer> (1) ; // used to test other methods;
	static int length = 10;
	
	@BeforeAll		
	public static void setup() {
		// TODO Auto-generated constructor stub
		test2.add(1);
		/*
		for ( int i = 1; i < length; i++) {
			test3.add(i);
			
		}
		*/
	}
	
	@Test
	void constructorTest() { // tests to make sure length is set correctly
		assertEquals(1, test.getLength(), "Error: constructor is wrong, length incorrect");
		assertEquals(null, test.getHead().next, "Error: constructor is wrong. next node is incorrect");
		assertEquals(test.getHead(), test.tail, "Error: constructor is wrong. tail and head should be equal");
		//assertEquals(1, test.getHead(), "Error: constructor is wrong. tail and head should be equal");

	}
	/*
	@Test
	void addtest() { // tests to make sure all values are set correctly when adding a single node;
		assertEquals(2, test2.getLength(), "Error: length is wrong");
		assertEquals(test2.getHead().next, test2.tail, "Error: head.next and tail should be equal");
	}
	
	@Test
	void addtest2() {
		assertEquals(length, test2.getLength(), "Error: length is wrong");
	}
	
	*/
	
}
