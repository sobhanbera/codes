package codeforces;

import java.util.Scanner;
import java.util.TreeSet;

public class A228 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i < 5; i++)
			set.add(sc.nextInt());
		sc.close();
		
		int answer = 4 - set.size();
		
		System.out.println(answer);
	}
}
