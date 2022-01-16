package assignment6;

public interface INode<T> {
	T getKey();

	void setKey(T Key);

	INode<T> getNext();

	void setNext(INode<T> next);

}
