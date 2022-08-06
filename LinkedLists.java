package Data_Structure;

public class LinkedLists<E> {	
	
	Node<E> head;
	
	void add(E data) {
		Node<E> toAdd = new Node<E>(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	E removeLast() throws Exception{
		Node<E> temp = head;
		
		if(temp == null) {
			throw new Exception("Cannot remove elements from an empty list.");
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
	
	E getLast() throws Exception{
		Node<E> temp = head;
		
		if(temp == null) {
			throw new Exception("Cannot peek elements from an empty list.");
		}
		
		while(temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	boolean isEmpty() {
		return head == null;
	}
	
	static class Node<E>{
		E data;
		Node<E> next;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
	
}
