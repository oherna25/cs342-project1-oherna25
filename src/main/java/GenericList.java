import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// do i need?
// import org.w3c.dom.Node; 

public abstract class GenericList<T> implements Iterable<T> {

	public GenericList() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract class Node<T> {
		T data;
		Node<T> next;
		
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
	private int length;
	
	public void print() {
		
	}
	
	public void add (T data) {
		
	}
	
	public T delete() {
		return null;
		
	}
	
	public ArrayList<T> dumpList() {
		return null;
		
	}
	
	public T get(int index) {
		return null;
		
	}
	
	public T set(int index, T element) {
		return element;
		
	}
	
	public int getLength() {
		return length;
		
	}
	
	public void setLength(int val) {
		
		length = val;
	}
	
	public void getHead() {
		
	}
	
	public void setHead() {
		
	}
	
	public ListIterator<T> listIterator ( int index) {
		return null;
		
	}
	
	public  Iterator<T>  descendingIterator(  ) {
		return null;
		
	}
	
	

}
