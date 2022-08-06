package CP;

import java.util.Scanner;

public class Fun {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=0; i<n; i++) {
			int m = s.nextInt();
			System.out.println(m);
		}
		s.close();
	}
}
