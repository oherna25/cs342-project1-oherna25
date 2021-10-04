import java.util.ListIterator;
import org.w3c.dom.Node;
 

public class GLListIterator<T> implements ListIterator<T> {

	public GenericList<T>.Node<T> pos;
	int index;
	int length;
	
	// constructor
	// sets index and pos variables
	public GLListIterator(int val, GenericList<T> list) {
		// TODO Auto-generated constructor stub
		index = val;
		pos = list.getHead();
		length = list.getLength();

	}
	
	public T next() {

		GenericList<T>.Node<T> temp = pos;
		pos = pos.next;
		index++;
		return temp.data;
		
	}
	
	// if pos(cursor) is null returns false 
	// else returns true
	public boolean hasNext() {
	
		if ( pos == null ) {
			return false;
		}
		
		return true;
	
	}
	
	public boolean hasPrevious() {
		
		if (pos == null) {
			return false;
		}
		return true;
	}
	
	public int nextIndex() {
		
		return index++;
		
	}
	
	public T previous() {
		GenericList<T>.Node<T> temp = pos;
		pos = pos.prev;
		index--;
		return temp.data;
	}
	
	public int previousIndex() {
		
		return index--;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(T e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(T e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
