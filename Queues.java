package Data_Structure;

import Data_Structure.LinkedLists.Node;

public class Queues<E> {

	private Node<E> head,rear;
	
	public void enqueue(E e) {
		Node<E> toAdd = new Node(e);
		if(head == null) {
			head = rear = toAdd;
			return;
		}
		rear.next = toAdd;
		rear = rear.next;
	}
	
	public E dequeue() {
		if(head == null) {
			rear = null;
			return null;
		}
		Node<E> temp = head;
		head = head.next;
		return temp.data;
	}
	
	public E peek() {
		
		if(head == null) {
			rear = null;
			return null;
		}
		return head.data;
	}
	
}
