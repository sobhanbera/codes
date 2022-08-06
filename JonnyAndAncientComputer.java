package codeforcesContest;

import java.util.Scanner;

public class JonnyAndAncientComputer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ti = 0;
			
			if(a == b) {
				System.out.println(ti);
			}else {
				while(true) {
					if(a > b) {
						int d = a << 1;
						int d1 = a << 2;
						int d2 = a << 3;
						int d4 = a * 4;
						int d8 = a * 8;
						int dd = a % 2 == 0 ? a/2 : a%4 == 0 ? a/4 : a%8 == 0 ? a/8 : 0;
						ti++;
						if(a >> 1 == b || a >> 3 == b || a >> 2 == b) {
							System.out.println(ti);
							break;
						}else if(a == 0) {
							
						}
					}else {
						int d = a << 1;
						int d1 = a << 2;
						int d2 = a << 3;
						int d4 = a * 4;
						int d8 = a * 8;
						int dd = a % 2 == 0 ? a/2 : a%4 == 0 ? a/4 : a%8 == 0 ? a/8 : 0;
						ti++;
						if(d == b || d1 == b || d2 == b || d4 == b || d8 == b || dd == b) {
							System.out.println(ti);
							break;
						}
					}
				}
			}
		}
		sc.close();
	}
	public static boolean equal(int a, int b) {
		return a == b;
	}
}
