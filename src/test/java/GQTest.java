
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

class GQTest {
	
	GenericQueue <Integer> test = new GenericQueue <Integer> (0) ; // used to test constructor
	GenericQueue <String> testString = new GenericQueue <String> ("a") ;
	GenericQueue <Double> testDouble = new GenericQueue <Double> (10.0) ;
	static GenericQueue  <Integer> test2 = new GenericQueue <Integer> (0) ; // used to test other methods;
	static GenericQueue  <Integer> test3 = new GenericQueue <Integer> (0) ; // used to test other methods;
	static ArrayList<Integer> testList = new ArrayList<Integer>();
	static ArrayList<Integer> reverseList = new ArrayList<Integer>();
	static int length = 10;
	
	@BeforeAll		
	public static void setup() {
		// TODO Auto-generated constructor stub
		test2.add(1);
		
		for ( int i = 1; i < length; i++) {
			test3.add(i);
			
		}
		
		for ( int i = 0; i < length; i++) {
			testList.add(i);
			
		}
		
		for ( int i = length; i > 0; i--) {
			reverseList.add(i);
			
		}
		
	}
	
	@Test
	void constructorTest() { // tests to make sure length is set correctly
		assertEquals(1, test.getLength(), "Error: constructor is wrong, length incorrect");
		assertEquals(null, test.getHead().next, "Error: constructor is wrong. next node is incorrect");
		assertEquals(test.getHead(), test.tail, "Error: constructor is wrong. tail and head should be equal");
		// System.out.println("test dump " + dump.size());

	}
	
	@Test
	void deleteTest() { // tests dequeque on a single node list 
		test.dequeue();
		assertEquals(0, test.getLength(), "enqueque did not work properly");
		assertEquals(null, test.getHead(), "head should be deleted");
		// System.out.println("test dump " + dump.size());

	}
	
	@Test
	void deleteTest2() { // tests dequeque on a two node list 
		//System.out.println("dequeque: " + test2.dequeue());
		assertEquals(2, test2.getLength(), "enqueque did not work properly");
		System.out.println("head: " + test2.getHead().data);
		assertEquals(0, test2.getHead().data, "head value should be 0");

	}
	
	@Test
	void constructorTest2() { // tests to make sure length is set correctly
		assertEquals(1, test.getLength(), "Error: constructor is wrong, length incorrect");
		assertEquals(null, test.getHead().next, "Error: constructor is wrong. next node is incorrect");
		assertEquals(test.getHead(), test.tail, "Error: constructor is wrong. tail and head should be equal");
		// System.out.println("test dump " + dump.size());

	}
	
	@Test
	void addtest() { // tests to make sure all values are set correctly when adding a single node;
		ArrayList<Integer> dump =  test2.dumpList();
		assertEquals(2, test2.getLength(), "Error: length is wrong");
		assertEquals(test2.getHead().next, test2.tail, "Error: head.next and tail should be equal");
		// System.out.println("test2 head.next: " + test2.getHead().next);
		// System.out.println("test2.tail: " + test2.tail);
		// System.out.println("test 2 dump " + dump.size());
	}
	
	@Test
	void enquequeTest() { // test enqueque
		test2.enqueue(3);
		assertEquals(3, test2.getLength(), "Error: length is wrong");
		assertEquals(0, test2.getHead().data, "head is incorrect");

	}
	
	
	@Test
	void addtest2() {
		ArrayList<Integer> dump =  test3.dumpList();
		assertEquals(length, test3.getLength(), "Error: length is wrong");
		System.out.println("test 3 dump " + dump.size());
		for (int i : dump) {
			System.out.println(i);
		}
	}
	
	@Test
	void iterable() {

		for (int i : test3) {
			
			assertEquals( i, testList.get(i), "both lists should be equal");
		}

	}
	
	@Test
	void iterable2() {

		ListIterator<Integer> litr = test3.listIterator(0); 
		int i = 0;
		while(litr.hasNext()){
		    
			assertEquals( litr.next(), testList.get(i), "both lists should be equal");
			i++;
		}
		
	}
	
	@Test
	void reverseIterator() {

		Iterator<Integer> litr = test3.descendingIterator(); 
		int i = 0;
		while(litr.hasNext()){
		    
			assertEquals( litr.next(), reverseList.get(i), "both lists should be equal");
			i++;
		}
		
	}
	
}// end of GQTest class
