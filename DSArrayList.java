package Data_Structure;

import java.util.ArrayList;
import java.util.Collection;

public class DSArrayList {
	

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Apple");
		names.add("Grapes");
		names.add("Banana");
		names.add("Berry");
		names.add("Watermelon");
		
		ArrayList<String> name2 = new ArrayList<>();
		name2.add("Lemon");
		name2.add("Mango");
		name2.add("Papaya");
		
//		GenericClass<Double,Boolean> gc = new GenericClass<>(34.455,true);
//		GenericClass<Integer, Character> gc2 = new GenericClass<>(45,'c');
		
		ArrayList<String> name3 = new ArrayList<>();
		name3.add("Lemon");
		name3.add("Papaya");
		
		names.removeAll(name3);
		String i[] = new String[names.size()];
		
		names.toArray(i);

		for(String o :i ) {
			System.out.println(o);
		}
		
	}



}
