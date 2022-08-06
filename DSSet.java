package Data_Structure;

import java.util.*;

public class DSSet {

	public static void main(String[] args) {
		
		Set<Integer> num = new TreeSet<>();
		Set<Integer> num2 = new TreeSet<>();
		
		num.add(34);
		num.add(23);
		num.add(12);
		num.add(45);
		num.add(50);
		
		num2.add(100);
		num2.add(11);
		num2.add(12);
		num2.add(45);
		
		num.retainAll(num2);
		
		System.out.println(num + " " + num2);
		int nums = 9;
		System.out.println(-(-(nums)));
	}
}
