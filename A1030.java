package codeforces;

import java.util.Scanner;

public class A1030 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean hard = false;

		for(int i = 0; i < n; i++) {
			int val = sc.nextInt();
			if(val == 1)
				hard = true;
		}
		if(hard)
			System.out.println("HARD");
		else
			System.out.println("EASY");
		
	}
}
