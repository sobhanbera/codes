import java.util.*;

public class codechefFSQRT {
	
	public static void main(String... argss) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
			int n = sc.nextInt();
			double s = Math.sqrt(n);
			int sqrt = (int) s;
			System.out.println(sqrt);
		}
	}
}

