package codeforces.Contests;

import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int t = sc.nextInt();
			String a = sc.next();
			String b = sc.next();
			System.out.println(anagram(a, b));
		}
		sc.close();
	}
	
	public static String anagram(String a, String b) {
		boolean isAnagram = true;
		if(a.length() == b.length()) {
			char[] ac = a.toCharArray();
			char[] bc = b.toCharArray();
			int[] ascii = new int[26];
			
			for(int i = 0; i < ac.length; i++) {
				ascii[ac[i] - 'a']++;
				ascii[bc[i] - 'a']--;
			}
			for(int i : ascii) {
				if(i != 0) {
					isAnagram = false;
					break;
				}
			}
		}else {
			return "NO";
		}
		
		if(isAnagram)
			return "YES";
		return "NO";
	}
}
