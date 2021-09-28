
public abstract class GenericQueue<T> extends GenericList<T> {

	public GenericQueue(T val) {
		// TODO Auto-generated constructor stub
	}
	
	Node<T>  tail;

	public  T  removeTail() {
		return null;
		
	}
	
	// data will be added to the back (tail)
	public void add (T data) {
	
		int length = getLength();
		length++;
		setLength(length);
		
	}
	
	public void enqueue (T data) {
		
		this.add(data);
	}
	
	public T dequeue() {
		
		this.delete();
		return null;
		
		
	}
	
	
}
