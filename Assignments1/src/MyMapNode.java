
public class MyMapNode<K, V> implements INode<K> {
	K key;
	V value;
	MyMapNode<K, V> next;

	public MyMapNode(K key, V value) {
		super();
		key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public K setKey() {
		this.key = key;
	}

	public INode<K> getNext() {
		return next;
	}

	void setNext(Inode<K> next) {
		this.next = (MyMapNode<K, V>) next;
	}

	public V getValue() {
		return this.value;
	}

public void setValue(V Value ) ){this.value= value;}
}

	@Override
	public String toString
	{
	}

}
