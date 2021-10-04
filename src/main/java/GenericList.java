import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public abstract class GenericList<T> implements Iterable<T> {

	public GenericList() {
		// TODO Auto-generated constructor stub
	}
	
	// creates a custom Node class
	public class Node<T> {
		
		public T data;
		public Node<T> next;
		public Node<T> prev;
		
		public Node (T val) {
			
			data = val;
		}
		
	}

	/* do i need?
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	*/

	private Node<T> head; 
	private int length = 0;
	
	// prints items one by one;
	public void print() {
		
		Node<T> temp = head;
		if (length == 0) {
			System.out.println("Empty List");
			return;
		}
		
		while (temp.next != null) {
			System.out.println(temp);
			temp = temp.next;
		}
		
		
		
	}
	
	// abstract method 
	// adds node to list
	public abstract void add (T data);
	
	
	// method deletes head node
	// returns value at deleted node
	public T delete() {
		
		if (head == null) {
			return null;
		}
		
		T temp = head.data;
		Node<T> replace = head.next;
		setHead(replace);
		setLength(getLength() - 1); // decrement length by 1;
		return temp;
			
	}
	
	// methods goes through list and 
	// returns an Array list filled with all the data values
	public ArrayList<T> dumpList() {
		ArrayList<T> list = new ArrayList<T>();
		Node <T> temp = getHead();
		while (temp != null) {
		
			list.add(temp.data);
			temp = temp.next;
		}
		
		return list;
		
	}
	
	// method returns data at index 
	public T get(int index) {
		
		Node<T> temp = head;
		if (index > length) {
			return null;
		}
		
		for ( int i = 0; i < index; i++) {
			
			temp = temp.next;
		}
		
		return temp.data;
		
	}
	
	// method sets node data member at index
	// method returns generic type
	public T set(int index, T element) {
		
		Node<T> temp = head;
		T holder;
		// if index is more than length return null
		if (index > length) {
			return null;
		}
		
		// go to that index
		for ( int i = 0; i < index; i++) {
			
			temp = temp.next;
		}
		// save the previous value and save new one to that node 
		// then return the old value
		holder = temp.data;
		temp.data = element;
		return holder;
		
	}
	
	// returns length of list
	public int getLength() {
		return length;
		
	}
	
	// sets the length of the list
	public void setLength(int val) {
		
		length = val;
	}
	
	// returns head node of list
	public Node<T> getHead() {
	
		return head;
		
	}

	// sets head of list using val parameter
	public void setHead(Node<T> val) {
		
		head = val;
	}
	
	// returns a listIterator
	// sets GLLIterator based on the index parameter
	// returns null if index > length
	public ListIterator<T> listIterator ( int index) {
		
		GLListIterator<T> it = new GLListIterator<T>(index, this);

		if (index > length) {
			
			return null;
		}
		
		for (int i = 0; i < index; i++) {
			it.next();
		}
		
		return it;

	}
	
	// creates a new ReverseGLLIterator
	// sets it to the last node of the list
	// returns Iterator
	public  Iterator<T>  descendingIterator(  ) {
		
		ReverseGLLIterator<T> rev_it = new ReverseGLLIterator<T>(this);
		while (rev_it.hasNext()) {
			rev_it.next();
		}
		return rev_it;
		
	}
	
	// returns a new GLLIterator
	@Override
	public Iterator<T> iterator() {
		
		GLLIterator<T> it = new GLLIterator<T>(this);
		return it;
		
	}
	
} // end of class
