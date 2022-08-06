package CP;

public class AllTypes {

	public static void main(String[] args) {
		long a=0,b=0,c=1;
		
		long n=100;
		
		for(long i=0;i<n;i++) {
			a=b=c;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
	}
}
