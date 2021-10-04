//import GenericList.Node;

public class GenericStack<T>  extends GenericList<T> {

	public GenericStack(T val) {
		// TODO Auto-generated constructor stub
		Node<T> newHead; 
		newHead = new Node<T>(val); // initiate node
		newHead.next = null; // next node should be null
		setHead(newHead); // set head 
		setLength(getLength() + 1); // increment length by 1;
		tail = newHead; // first node will always be the tail (until removed)
	}
	
	Node<T>  tail;
	
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
	
	// method will add node to the front of the stack
	public void add (T data) {
		
		Node<T> newNode = new Node<T>(data); // create new node
		Node<T> temp = getHead();
		// System.out.println("old head: " + temp);
		// if head is null do nothing
		if (getHead() == null) {
			return;
		}
		
		setHead(null);
		newNode.next = temp;
		temp.prev = newNode;
		setHead(newNode);
		setLength(getLength() + 1);

	}
	
	public void push (T data) {
		
		add(data);
		
	}
	
	public T pop () {
		
		return delete();
		
	}

}
