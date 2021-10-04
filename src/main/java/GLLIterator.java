import java.util.Iterator;

import org.w3c.dom.Node;

public class GLLIterator<T> implements Iterator<T> {
	
	
	public GenericList<T>.Node<T> pos;

	public GLLIterator(GenericList<T> list) {
		// TODO Auto-generated constructor stub
		pos = list.getHead(); 
	}


	// returns false if next node is null
	// returns true if next node otherwise
	public boolean hasNext() {
		// TODO Auto-generated method stub
		//System.out.println("GLLIterator hasNext(): ");	
		
		if (  pos == null ) {
			return false;
		}
		
		return true;
	
	}

	// sets cursor position to the next 
	// returns the current data value
	public T next() {
		// TODO Auto-generated method stub
		//System.out.println("GLLIterator next(): ");
		//System.out.println("GLLIterator pos (before next): " + pos.data);
		GenericList<T>.Node<T> temp = pos;
		pos = pos.next;
		return temp.data;
		
	}

}
