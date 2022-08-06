package codeforces;

import java.util.Scanner;

public class A734 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();
		s = s.toLowerCase();
		int a = 0, d = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a')
				a++;
			else
				d++;
		}
		if(a > d)
			System.out.println("Anton");
		else if(a < d)
			System.out.println("Danik");
		else
			System.out.println("Friendship");
	}
}
