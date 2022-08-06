package codeforces;

import java.util.Scanner;

public class ACNSGURU123 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int a = 1, b = 1, c = 1;
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			a = b;
			b = c;
			c = a + b;
			sum += a;
		}
		System.out.println(sum);
	}
}
