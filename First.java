package MyQue;

import java.util.HashSet;
import java.util.LinkedList;

public class First {

	public static void main(String[] args) {

		LinkedList<LinkedList<String>> linkedList = new LinkedList<>();

		LinkedList<String> e = new LinkedList<>();
		e.add("A");
		e.add("B");
		LinkedList<String> e2 = new LinkedList<>();
		e2.add("B");
		e2.add("C");
		LinkedList<String> e3 = new LinkedList<>();
		e3.add("C");
		e3.add("D");
		LinkedList<String> e4 = new LinkedList<>();
		e4.add("D");
		e4.add("E");

		linkedList.add(e);
		linkedList.add(e2);
		linkedList.add(e3);
		linkedList.add(e4);
		
		System.out.println(destCity(linkedList));
	}	
	
	private static String destCity(LinkedList<LinkedList<String>> paths) {
		String result = "";
		HashSet<String> set = new HashSet<>();
		
		for(LinkedList<String> path : paths) {
			if(!set.contains(path.get(0))) {
				set.add(path.get(0));
			}
		}
		
		for(LinkedList<String> path : paths) {
			if(!set.contains(path.get(1))) {
				result = path.get(1);
				break;
			}
		}
		return result;
	}
}
