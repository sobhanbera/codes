package codeforces;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class A443 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();

		Set<Character> set = new TreeSet<>();
		
		line = line.substring(1,line.length()-1);
		
		for(int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if(c >= 97 && c <= 122)
				set.add(c);
		}
		System.out.println(set.size());
	}
}
