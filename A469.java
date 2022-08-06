package codeforces;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class A469 {

	public static void main(String...strings) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Set<Integer> set = new TreeSet<>();
		
		for(int i = 0; i < 2; i++) {
			int t = sc.nextInt();
			int level[] = new int[t];
			for(int j = 0; j < t; j++) {
				level[j] = sc.nextInt();
				set.add(level[j]);
			}
		}
		
		boolean pass = true;
		for(int i = 1; i <= n; i++) {
			if(!set.remove(i)) {
				pass = false;
				break;
			}
		}
		
		if(pass)
			System.out.println("I become the guy.");
		else
			System.out.println("Oh, my keyboard!");
		
	}
}
