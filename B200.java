package codeforces;

import java.util.Scanner;

public class B200 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		for(int i = 0; i < n; i++) {
			double v = sc.nextInt();
			sum += v;
		}
		System.out.printf("%.12f", (sum / n));
	}
}
