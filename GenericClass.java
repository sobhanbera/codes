package Data_Structure;

public class GenericClass<X,Y> {
	
	X x;
	Y y;
	
	GenericClass(X x,Y y){
		this.x = x;
		this.y = y;
	}
	
	public void desc() {
		System.out.println(x + " and " + y);
	}

}
