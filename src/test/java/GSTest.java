import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GSTest {

	GenericStack <Integer> test = new GenericStack <Integer> (0) ; // used to test constructor
	static GenericStack  <Integer> test2 = new GenericStack <Integer> (0) ; // used to test other methods;
	static GenericStack  <Integer> test3 = new GenericStack <Integer> (0) ; // used to test other methods;
	static ArrayList<Integer> compare;
	static ArrayList<Integer> testList = new ArrayList<Integer>();
	static ArrayList<Integer> reverseList = new ArrayList<Integer>();
	
	static int length = 10;
	
	@BeforeAll
	static void setup() {
		
		test2.add(1);
	
		for (int i = 1; i < length; i++) {
			test3.add(i);
			System.out.println("test3: " + i);
		}
		
		for ( int i = 0; i < length; i++) {
			testList.add(i);
			System.out.println("testList: " + i);
			
		}
		
		for ( int i = length -1; i > -1; i--) {
			reverseList.add(i);
			System.out.println("reverseList: " + i);
			
		}
		
	}
	
	
	
	//@Test
	void constructorTest() { // tests to make sure length is set correctly
		ArrayList<Integer> dump =  test.dumpList();
		assertEquals(1, test.getLength(), "Error: constructor is wrong, length incorrect");
		assertEquals(null, test.getHead().next, "Error: constructor is wrong. next node is incorrect");
		assertEquals(test.getHead(), test.tail, "Error: constructor is wrong. tail and head should be equal");
		// System.out.println("test dump " + dump.size());

	}
	
	
	
	
	@Test
	void addtest() { // tests to make sure all values are set correctly when adding a single node;
		ArrayList<Integer> dump =  test2.dumpList();
		GenericList<Integer>.Node<Integer> node = test2.getHead();
		// System.out.println("test 2 dump " + dump.size());

		assertEquals(2, test2.getLength(), "Error: length is wrong");
		assertEquals(test2.getHead().next, test2.tail, "Error: head.next and tail should be equal");
		// System.out.println("test2 head.next: " + test2.getHead().next);
		// System.out.println("test2.tail: " + test2.tail);
		
	}
	
	
	@Test
	void addtest2() {
		ArrayList<Integer> dump =  test3.dumpList();
		assertEquals(length, test3.getLength(), "Error: length is wrong");
		for (int i : dump) {
			System.out.println(i);
		}
	}
	
	@Test
	void pushTest() { // tests push
		test2.push(3);
		assertEquals(3, test2.getLength(), "Error: length is wrong");
		assertEquals(3, test2.getHead().data, "head is incorrect");

	}
	
	void popTest() { // tests push
		
		assertEquals(3, test2.pop(), "Error: pop is incorrect");
		assertEquals(3, test2.getLength(), "Error: length is wrong");
		assertEquals(3, test2.getHead().data, "head is incorrect");

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
		    
			assertEquals( litr.next(), reverseList.get(i), "both lists should be equal");
			i++;
		}
		
	}

	@Test
	void reverseIterator() {

		Iterator<Integer> litr = test3.descendingIterator(); 
		int i = 0;
		while(litr.hasNext()){
		    
			assertEquals( litr.next(), testList.get(i), "both lists should be equal");
			i++;
		}
		
	}

}
