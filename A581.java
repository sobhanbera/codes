package codeforces;

import java.util.Scanner;

public class A581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a > b) {
			System.out.print(b + " ");
			a -= b;
			a /= 2;
			System.out.print(a);
		}else if(b > a) {
			System.out.print(a + " ");
			b -= a;
			b /= 2;
			System.out.print(b);
		}else
			System.out.print(a + " 0");
	}
}
