package listComparison;

public class Node<T> {
	private Node<T> next;
	T data;
	public Node(T data) {
		this.data = data;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public Node<T> getNext() {
		return next;
	}
	public T getData() {
		return data;
	}

}
