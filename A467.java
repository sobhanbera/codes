package codeforces;

import java.util.Scanner;

public class A467 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int total = 0;
		for(int i = 0; i < t; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			if(q - p >= 2)
				total += 1;
		}
		System.out.println(total);
	}

}
