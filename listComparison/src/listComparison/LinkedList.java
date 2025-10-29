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
	public T remove(int index) {
		Node<T> temp = startingNode;
		Node<T> valueCopy = temp;
		if(index == 0 ) {
			startingNode = temp.getNext();
			size--;
			return valueCopy.data;
		}
		for(int i = 0; i < index -1 ; i++) {
			temp = temp.getNext();
		}
		 valueCopy = temp.getNext();
		Node<T> newPointer = temp.getNext().getNext();
		temp.setNext(newPointer);
		size --;
		return valueCopy.data;//valueCopy.data;
		
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
