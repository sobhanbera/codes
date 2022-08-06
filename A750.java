package codeforces;

import java.util.Scanner;

public class A750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int values0 = sc.nextInt();
		int values1 = sc.nextInt();
		sc.close();
		
		int totalMin = 240;
		int m = 5;
		int done = 0;
		
		for(int i = 0; i < values0; i++, m += 5) {
			totalMin -= m;
			if(totalMin<values1)
				break;
			else
				done++;
		}
		System.out.println(done);
	}
}
