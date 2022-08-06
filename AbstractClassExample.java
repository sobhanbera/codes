package Oops;

public class AbstractClassExample {
	
	public static void repair(WagonR car) {
		System.out.println("WagonR repaired");
	}
	
	public static void repair(Audi car) {
		System.out.println("Audi repaired");
	}
	
	public static void main(String[] args) {
		WagonR car1 = new WagonR();
		Audi car2 = new Audi();
		
		repair(car1);
		repair(car2);
	}

}
