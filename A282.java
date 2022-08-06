package codeforces;

import java.util.Scanner;

public class A282 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			if(s.contains("-"))
				--num;
			else
				++num;
		}
		System.out.println(num);
	}
	
}
