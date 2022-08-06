package Programs;

public interface Wire<E extends Number> {
	
	void add(E data);
	
	E remove() throws Exception;
	
	int indexOf(E element) throws Exception;
	
	E elementAtIndex(int index) throws Exception;

	int size() throws Exception;
}
