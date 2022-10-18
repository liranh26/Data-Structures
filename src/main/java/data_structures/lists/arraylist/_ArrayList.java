package data_structures.lists.arraylist;

public class _ArrayList<E> {

	private Object[] data;
	private int size;
	private final int DEFAULT_SIZE = 10;

	public _ArrayList() {
		size = 0;
		data = new Object[DEFAULT_SIZE];
	}

	public _ArrayList(int length) {
		this.size = 0;
		data = new Object[length];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}

	public void add(E element) {

		if (size >= data.length * 0.7f) {
			Object[] tmp = new Object[size * 2];
			copyArrays(tmp, data);
			data = tmp;
		}
		data[size] = element;
		size++;
	}

	private void copyArrays(Object[] curr, Object[] old) {
		for (int i = 0; i < old.length; i++)
			curr[i] = old[i];
	}

	public E remove(int index) {
		int i = index;
		@SuppressWarnings("unchecked")
		E element = (E) data[i];
		size--;
		
		while (i < size && data[i + 1] != null) {
			data[i] = data[i + 1];
			i++;
		}
		
		return element;
	}

}
