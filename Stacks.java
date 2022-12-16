package Data_Structure;

public class Stacks<E> {

	private LinkedLists<E> ll = new LinkedLists<>();

	void push(E e) {
		ll.add(e);
	}

	E pop() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Empty stack cannot be popped");
		}
		return ll.removeLast();
	}

	E peek() throws Exception{
		return ll.getLast();
	}
}

