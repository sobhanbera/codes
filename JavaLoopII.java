package hackerrank;

import java.util.Scanner;

public class JavaLoopII {
	public static void main(String...strings) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a, b, n, sum;
		
		while(t > 0) {
			a = sc.nextInt();
			b = sc.nextInt();
			n = sc.nextInt();
			sum = a;
			for(int i=0; i < n; i++) {
				sum += (int) (Math.pow(2, i) * b);
				System.out.print(sum+" ");
			}
			t--;
			System.out.println();
		}
		sc.close();
	}
}
