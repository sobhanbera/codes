package Programs;

/**
 * @author Sobhan Bera (SB)
 * @since 25 May 2020, 22:20
 * @version 1.0.0
 * @working a different type of datatype
 */

public class Cable<E extends Number> implements Wire<E>{

	Node<E> head;
	
	static class Node<E> {
		E data;
		Node<E> next;
		Node(E data){
			this.data = data;
			this.next = null;
		}
	}
	
	boolean cableIsEmpty() {
		return head == null;
	}
	
	@Override
	public int size() throws Exception{
		Node<E> temp = head;
		if(temp == null) {
			throw new Exception("cable is empty.");
		}
		int size = 0;
		while(temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}
	
	void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	@Override
	public String toString() {
		String result = "[";
		
		Node<E> temp = head;
		while(temp != null) {
			result += String.valueOf(temp.data);
			if(temp.next != null)
				result += ", ";
			temp = temp.next;
		}
		result += "]";
		return result;
	}

	@Override
	public void add(E data) {
		Node<E> toAdd = new Node<E>(data);
		
		if(cableIsEmpty()) {
			head = toAdd;
			return;
		}
		
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}

	@Override
	public E remove() throws Exception{
		Node<E> temp = head;
		if(temp == null) {
			throw new Exception("Cannot remove element from empty cable.");
		}
		if(temp.next == null) {
			Node<E> toRemove = head;
			head = null;
			return toRemove.data;
		}
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
	}

	@Override
	public int indexOf(E element) throws Exception{
		Node<E> toFind = new Node<>(element);
		Node<E> temp = head;
		int index = 0;
		if(temp == null) {
			throw new Exception("Cable is empty.");
		}
		while(temp.data != toFind.data) {
			index++;
			temp = temp.next;
		}
		return index;
	}

	@Override
	public E elementAtIndex(int index) throws Exception{
		int i = 0;
		if(cableIsEmpty()) {
			int size = this.size();
			throw new Exception("Index " + size + " out of bounds for length " + size);
		}
		Node<E> temp = head;
		while(i != index) {
			temp = temp.next;
			if(temp == null) {
				int size = this.size();
				throw new Exception("Index " + size + " out of bounds for length " + size);
			}
			i++;
		}
		E e = temp.data;
		return e;
	}
	
	//just for example...
	public boolean binary(E data) throws Exception{
		Node<E> temp = head;
		if(temp == null) {
			throw new Exception("cable is empty.");
		}
		Node<E> toFind = new Node<>(data);
		int start = 0;
		int end = this.size();
		int mid = (start + end) / 2;
		while(start <= end) {
			if((double)this.elementAtIndex(mid) < (double)toFind.data) {
				start = mid + 1;
			}else if((double)this.elementAtIndex(mid) > (double)data) {
				end = mid - 1;
			}else {
				return true;
			}
			mid = (start + end) / 2;
		}
		return false;
	}
	
	public boolean linear(E data) throws Exception{
		Node<E> temp = head;
		if(temp == null) {
			throw new Exception("cable is empty.");
		}
		Node<E> toFind = new Node<>(data);
		while(temp != null) {
			temp = temp.next;
			if(temp.data == toFind.data)
				return true;
		}
		return false;
	}
}
