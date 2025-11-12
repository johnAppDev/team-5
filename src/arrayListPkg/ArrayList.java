package arrayListPkg;

// Custom generic ArrayList implementation
public class ArrayList<T> {
	
	private T[] data;     
	private int size;     
	private int capacity;
	   
	@SuppressWarnings("unchecked")
	public ArrayList() {
		capacity = 10; // default initial capacity
		data = (T[]) new Object[capacity];
		size = 0;
	   }

	// Add element to the end of the list
	public void add(T element) {
		if (size == capacity) {
				resize();
		}
		data[size] = element;
		size++;
	}
	
	// Add an element at a specific index
	public void add(int index, T element) {
        if (index < 0 || index > size) { // allow index == size (append)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size == capacity) {
            resize();
        }
        // Shift elements to the right
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = element;
        size++;
    }
 
	// Get element at index
	public T get(int index) {
		if (index < 0 || index >= size) {
				throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		return data[index];
	}

	// Remove element at index and return it
	public T remove(int index) {
		if (index < 0 || index >= size) {
				throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		T removed = data[index];
		// shift elements to the left
		for (int i = index; i < size - 1; i++) {
				data[i] = data[i + 1];
		}
		data[size - 1] = null; // avoid memory leak
		size--;
		return removed;
	}

	// Return number of elements
	public int size() {
		return size;
	}

	// Resize the array when full (double the capacity)
	@SuppressWarnings("unchecked")
	private void resize() {
		capacity *= 2;
		T[] newData = (T[]) new Object[capacity];
		for (int i = 0; i < size; i++) {
			newData[i] = data[i];
		}
		data = newData;
	}

	// String representation
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size; i++) {
			sb.append(data[i]);
			if (i < size - 1) sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}
}