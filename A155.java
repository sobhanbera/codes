package codeforces;

import java.util.Scanner;

public class A155 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p[] = new int[n];
		
		int high = -1, low = 1000000000*1000000000;
		int ans = 0;
		
		for(int i = 0; i < n; i++) {
			p[i] =  sc.nextInt();
			
		}
		sc.close();
	}
}
