package linkedListPkg;

public class LinkedList<T> {
	
	private int size;
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

	public void add(int index, T data) {
	    if (index < 0 || index > size) {
	        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
	    }

	    if (index == 0) {
	        Node<T> newNode = new Node<T>(data);
	        newNode.setNext(startingNode);
	        startingNode = newNode;
	        size++;
	        return;
	    }

	    Node<T> temp = startingNode;
	    for (int i = 0; i < index - 1; i++) {
	        temp = temp.getNext();
	    }

	    Node<T> newNode = new Node<T>(data);
	    newNode.setNext(temp.getNext());
	    temp.setNext(newNode);

	    size++;
	}
	
	public T remove(int index) {
		Node<T> temp = startingNode;
		Node<T> valueCopy = temp;
		if(index == 0 ) {
			startingNode = temp.getNext();
			size--;
			return valueCopy.getData();
		}
		for(int i = 0; i < index -1 ; i++) {
			temp = temp.getNext();
		}
		 valueCopy = temp.getNext();
		Node<T> newPointer = temp.getNext().getNext();
		temp.setNext(newPointer);
		size --;
		return valueCopy.getData();//valueCopy.data;
		
	}
	
	public T get(int index) {
		Node<T> temp = startingNode;
		for(int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		return temp.getData();
	}
	
	public int size() {
		return size;
	}
}
