package codeforces;

import java.util.*;

public class A1328 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			System.out.println(div(a, b));
		}
		
		sc.close();
	}
	
	public static int div(long a, long b) {
		int sum = 0;
		if(a % b == 0)
			return sum;
		else {
			while(true) {
				a++;
				sum++;
				if(a % b == 0)
					return sum;
			}
		}
	}
}
