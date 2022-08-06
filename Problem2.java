package projectEuler;

public class Problem2 {

	public static void main(String[] args) {
		
		long a = 1;
		long b = 1;
		long c = 2;
		long sum = 0;
		for(long i = 0; i < 75; i++) {
			a = (long)b;
			b = (long)c;
			c = (long)a + (long)b;
			if(a < (long)4000000 && a % 2==0) {
				sum += a;
//				System.out.println(a);
			}
		}
		System.out.println(sum);
	}
}
