package Data_Structure;

public class DSLinkedList {

	public static void main(String[] args) {

		LinkedLists<String> sll = new LinkedLists<>();
		sll.add("gfhf");
		sll.add("ewrewqt");
		sll.print();
		
	}
	
//	static void removeList(List<Integer> list) {
//		
//		double start = System.currentTimeMillis();
//		
//		for(int i=0;i<100000;i++) {
//			list.remove(0);
//		}
//		
//		double end = System.currentTimeMillis();
//		System.out.println(list.getClass().getName()+"-->"+(end-start));
//		
//		
//	}
//	
//	static List<Integer> timeDiff(List<Integer> list) {
//		
//		double start = System.currentTimeMillis();
//		
//		for(int i=0;i<100000;i++) {
//			list.add(0,i);
//		}
//		double end = System.currentTimeMillis();
//		System.out.println(list.getClass().getName()+ "-->"+ (end-start));
//		return list;
//	}

}
