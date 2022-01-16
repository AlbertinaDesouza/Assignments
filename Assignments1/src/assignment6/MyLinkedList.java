package assignment6;

public class MyLinkedList<T> {

	public MyLinkedList() {
		super();
	}

	private INode<T> head;
	private INode<T> tail;

	public MyLinkedList(INode<T> head, INode<T> tail) {
		super();
		this.head = head;
		this.tail = tail;
	}

	public INode<T> search(T key) {

		INode<T> tempNode = head; // Initialize current
		while (tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(key)) {
				return tempNode; // data found
			}
			tempNode = tempNode.getNext();
		}
		// data not found

		// TODO Auto-generated method stub
		return null;
	}

//	public void append(MyMapNode<K, V> myMapNode) {
//		// TODO Auto-generated method stub
//		
//	}
	public void add(INode<T> newNode) {

		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			INode<T> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}

	}

	public void append(INode<T> myNode) {

		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {

			this.tail.setNext(myNode);
			this.tail = myNode;
		}

	}

}
