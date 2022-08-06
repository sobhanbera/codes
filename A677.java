package codeforces;

import java.util.Scanner;

public class A677 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			int height = sc.nextInt();
			if(height > h)
				sum += 2;
			else
				sum++;
		}
		System.out.println(sum);
	}
}
