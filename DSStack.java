package Data_Structure;

//import java.util.Stack;


public class DSStack {
	
	public static void main(String[] args) throws Exception{
		
//		Stack<Integer> s = new Stack<>();
//		s.push(34);
//		s.push(23);
//		s.push(12);
//		System.out.println(s);
//		int l = s.pop();
//		System.out.println(s);
//		l = s.peek();
//		System.out.println(l);
		
		Stacks<Integer> stacks = new Stacks<>();
//		stacks.push(23);
//		stacks.push(100);
//		stacks.push(12);
//		stacks.push(70);
		int popped = stacks.pop();
		int peeked = stacks.peek();
		
		System.out.println(popped+" "+peeked);
		
	}

}
