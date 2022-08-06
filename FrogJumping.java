package codeforces;

import java.io.*;
import java.util.*;

public class FrogJumping {

	private static Scanner sc = new Scanner(System.in);
	private static InputStreamReader ip = new InputStreamReader(System.in);
	private static BufferedReader br = new BufferedReader(ip);
	
	public static void main(String... args) {
		int t = sc.nextInt();
		for(int i = 0; i < t; i++)
			Solution();
	}
	
	static void Solution() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		Queue<Integer> qu = new LinkedList<>();

		for(int i = 1; i <= k; i++) {
			if(i % 2 == 0) qu.add(b);
			else qu.add(a);
		}
		boolean n = true;
		int sum = 0;
		while(true) {
			if(qu.isEmpty())
				break;
			int e = qu.poll();
			if(qu.isEmpty())
				break;
			int f = qu.poll();
			if(n)
				sum += e - f;
			else
				sum += e + f;
			n = !n;
		}
		System.out.println(sum);
	}
}
