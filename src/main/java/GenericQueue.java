
public  class GenericQueue<T> extends GenericList<T> {

	Node<T>  tail;

	public GenericQueue(T val) {
		// TODO Auto-generated constructor stub
		Node<T> newHead; 
		newHead = new Node<T>(val); // initiate node
		newHead.next = null; // next node should be null
		setHead(newHead); // set head 
		setLength(getLength() + 1); // increment length by 1;
		tail = newHead;
		
		
	}
	
	
	public  T  removeTail() {
		Node<T> temp = getHead();
		T val;
		
		if(temp == tail) {
			val = temp.data;
			setHead(null);
			tail = null;
			return val;
		}
		
		while (temp.next != tail) {
			temp = temp.next;
		}
		val = temp.next.data;
		temp.next = null;
		tail = temp;
		return val;
		
	}
	
	// data will be added to the back (tail)
	@Override
	public void add (T data) {

		if (getHead() == null) {
			return;
		}
		Node<T> newHead; 
		newHead = new Node<T>(data); // initiate node
		getHead().next = newHead;
		tail = newHead;
		setLength(getLength() + 1); // increment length by 1;
		
		
	}
	
	public void enqueue (T data) {
		
		add(data);
	}
	
	public T dequeue() {
		
		delete();
		return null;
		
		
	}
	
	
}
