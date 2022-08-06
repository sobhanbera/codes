package codeforces;

import java.util.Scanner;

public class A996 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		
		int sum = 0;
		while(m >= 1) {
			if(m >= 100) {
				sum += (m/100);
				m %= 100;
			}else if(m < 100 && m >= 20) {
				sum += (m/20);
				m %= 20;
			}else if(m < 20 && m >= 10) {
				sum += (m/10);
				m %= 10;
			}else if(m < 10 && m >= 5) {
				sum += (m/5);
				m %= 5;
			}else if(m < 5 && m >= 1) {
				sum += (m/1);
				m %= 1;
			}
		}
		System.out.println(sum);
	}
}
