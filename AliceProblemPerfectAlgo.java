package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class AliceProblemPerfectAlgo {

	public static void main(String[] args) {

		int n = new Scanner(System.in).nextInt();
		
		int a[] = new int[n];
		int c[] = new int[n];
		
		int sum = 0;
		
		Arrays.fill(c, 1);
		
		for (int i = 0; i < n; i++) {
			a[i] = new Scanner(System.in).nextInt();
		}
		
		for (int i = 1; i < n; i++) {
			if(a[i] > a[i-1]) {
				c[i] = c[i-1] + 1;
			}
		}
		
		for (int i = n-2; i >= 0; i--) {
			if(a[i] > a[i+1]) {
				c[i] = Math.max(c[i+1] + 1,c[i]);
			}
		}
		
		for (int i : c) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
