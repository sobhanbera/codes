package projectEuler;

public class Problem20 {
	
	public static void main(String[] args) {
		String factorialOf100 = Number.factorialOf("100");
		System.out.println(factorialOf100);
		int sum = 0;
		
		for(int i=0; i < factorialOf100.length() - 1; i++) {
			sum += Integer.parseInt(factorialOf100.substring(i,i+1));
		}
		System.out.println(sum);
	}
}
