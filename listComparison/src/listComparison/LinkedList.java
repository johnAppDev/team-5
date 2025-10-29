package listComparison;

public class LinkedList<T> {
	int size;
	Node<T> startingNode;
	public LinkedList() {
		size = 0;
	}
	public void add(T data) {
		size++;
		if(startingNode == null) {
			startingNode = new Node<T>(data);
		}else {
		
			Node<T> next = startingNode.getNext();
			Node<T> reference = startingNode;
			while(next != null) {
				reference = next;
				next = next.getNext();
			}
			reference.setNext(new Node<T>(data));
			
		}
	}
	public void remove(int index) {
		Node<T> temp = startingNode;
		if(index == 0 ) {
			startingNode = temp.getNext();
			
		}
		for(int i = 0; i < index -1 ; i++) {
			temp = temp.getNext();
		}
		Node<T> newPointer = temp.getNext().getNext();
		temp.setNext(newPointer);
		size --;
		
	}
	public T get(int index) {
		Node<T> temp = startingNode;
		for(int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		return temp.data;
	}
	public int size() {
		return size;
	}
}
