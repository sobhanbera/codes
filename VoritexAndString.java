package codechef.ContestCrackMeIfYouCan;

import java.util.Scanner;

public class VoritexAndString {

	public static void main(String... strings) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int ans = 0;
		for(int i=0; i<t; i++) {
			String s = sc.next();
			int sm = 0;
			int la = 0;
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(j) >= 65 && s.charAt(j) <= 90) {
					la++;
				}
				else if(s.charAt(j) >= 97 && s.charAt(j) <= 122) {
					sm++;
				}
			}
			ans += Math.abs(la-sm);
		}
		System.out.println(ans);
	}
}
