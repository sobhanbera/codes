package codeforces;

import java.util.Random;
import java.util.Scanner;

public class RandomElementGenerator {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		sc.close();
		for(int i = 0; i < n; i++) {
			System.out.println(r.nextInt(l));
		}
	}
}
