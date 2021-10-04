
public  class GenericQueue<T> extends GenericList<T> {

	public Node<T>  tail;

	// constructor: creates a new node based on val
	// passes it to setHead
	// tail is set to new node
	public GenericQueue(T val) {
		// TODO Auto-generated constructor stub
		Node<T> newHead; 
		newHead = new Node<T>(val); // initiate node
		newHead.next = null; // next node should be null
		setHead(newHead); // set head 
		setLength(getLength() + 1); // increment length by 1;
		tail = newHead;
		
	}
	
	// removes Tail from list
	// returns value of tail
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
	
	// adds node to list 
	// since this a queque nodes at added at the end of list
	@Override
	public void add (T data) {
		
		Node<T> newHead; // create new node
		Node<T> prev; // create new node
		
		newHead = new Node<T>(data); // initiate node
		tail = newHead;
		
		// if there is no head return null
		if (getHead() == null) {
			return;
		}
		
		Node<T> temp = getHead(); // create new node for traversal
		// if there is only one node set the next one to be 
		if (getLength() == 1) {
			
			newHead.prev = getHead();
			temp.next = newHead;
			tail = newHead;
			setLength(getLength() + 1);
			return;
			
		}
		
		while (temp.next != null) {
			
			temp = temp.next;
		}

		newHead.prev = temp;
		temp.next = newHead;
		setLength(getLength() + 1);
		
	}
	
	// uses add to remove nodes from list
	public void enqueue (T data) {
		
		add(data);
	}
	
	// returns the value returned by delete()
	public T dequeue() {
		
		return delete();

	}
		
}
