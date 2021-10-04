import java.util.Iterator;

public class ReverseGLLIterator<T> implements Iterator<T> {

	public GenericList<T>.Node<T> pos;
	
	public ReverseGLLIterator(GenericList<T> list) {
		// TODO Auto-generated constructor stub
		pos = list.getHead();
		
	}
	
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (  pos == null ) {
			return false;
		}
		
		return true;
		
	}

	public T next() {
		// TODO Auto-generated method stub
		GenericList<T>.Node<T> temp = pos;
		pos = pos.prev;
		return temp.data;
		
	}
	

}


