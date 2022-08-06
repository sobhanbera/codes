package codeforces;

import java.util.Scanner;

public class A520 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		str = str.toLowerCase();
		sc.close();
		boolean isPanagram = true;
		
		if(n < 26) {
			System.out.println("NO");
			System.exit(0);
		}else {
			for(int i = 97; i <= 122; i++) {
				if(!str.contains(String.valueOf((char)i))) {
					isPanagram = false;
					break;
				}
			}
		}
		if(isPanagram)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
