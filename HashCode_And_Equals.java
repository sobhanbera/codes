package Data_Structure;

import java.util.*;

public class HashCode_And_Equals {

	public static void main(String[] args) {
		
		Pen pen1 = new Pen(10, "blue");
		Pen pen2 = new Pen(10, "blue");
		
		System.out.println(pen1);
		System.out.println(pen2);
		
//		System.out.println(pen1.equals(pen2));
		
		Set<Pen> pens = new HashSet<>();
		pens.add(pen1);
		pens.add(pen2);
		System.out.println(pens);
		
	}
}

class Pen{
	
	int price;
	String color;
	
	public Pen(int price, String color) {
		this.price = price;
		this.color = color;
	}
	
	@Override
	public int hashCode() {
		return price + color.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Pen that = (Pen) obj;
		boolean isEqual = this.price == that.price && this.color.equals(that.color);
		return isEqual;
	}
}
