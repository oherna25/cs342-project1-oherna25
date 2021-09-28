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
		
		if (length == 0) {
			System.out.println("Empty List");
			return;
		}
		
		
	}
	
	public abstract void add (T data);
	
	public T delete() {
		
		if (head == null) {
			return null;
		}
		T temp = head.data;
		Node<T> replace = head.next;
		head = replace;
		return temp;
			
	}
	
	public ArrayList<T> dumpList() {
		ArrayList<T> list = null;
		while (head != null) {
		
			list.add(delete());
		}
		
		
		return list;
		
	}
	
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
	
	public T set(int index, T element) {
		
		Node<T> temp = head;
		T holder;
		if (index > length) {
			return null;
		}
		
		for ( int i = 0; i < index; i++) {
			
			temp = temp.next;
		}
		holder = temp.data;
		temp.data = element;
		return holder;
		
	}
	
	public int getLength() {
		return length;
		
	}
	
	public void setLength(int val) {
		
		length = val;
	}
	
	public Node<T> getHead() {
		
		return head;
		
	}
	
	public void setHead(Node<T> head) {
		
		head = this.head;
	}
	
	public ListIterator<T> listIterator ( int index) {
		return null;
		
	}
	
	public  Iterator<T>  descendingIterator(  ) {
		return null;
		
	}
	
	public Iterator<T> iterator() {
		return null;
		
	}
	
	

}
