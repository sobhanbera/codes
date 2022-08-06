package codeforces;

import java.util.Scanner;

public class A271 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		
		while(true) {
			year++;
			if(distinct(year)) {
				System.out.println(year);
				break;
			}
		}
	}
	
	public static boolean distinct(int year) {
		String y = String.valueOf(year);
		
		for(int i = 0; i < y.length() - 1; i++) {
			char ic = y.charAt(i);
			for(int j = i + 1; j < y.length(); j++) {
				char jc = y.charAt(j);
				if(jc == ic) {
					return false;
				}
			}
		}
		
		return true;
	}
}
