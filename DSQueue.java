package Data_Structure;

public class DSQueue {
	
	
	public static void main(String[] args) {
		
//		Queue<Integer> q = new LinkedList<>();
//		q.add(98);
//		q.add(32);
//		q.add(56);
//		q.add(45);
//		q.add(67);
//		
//		System.out.println(q);
//		System.out.println(q.remove());
//		System.out.println(q.poll());
		
		Queues<Integer> f = new Queues<>();
		
		f.enqueue(12);
		f.enqueue(85);
		f.enqueue(10);
		f.enqueue(27);
		f.enqueue(30);
		System.out.println(f.peek());
		System.out.println(f.dequeue());
		System.out.println(f.peek());
	}
	
}
