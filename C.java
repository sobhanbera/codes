package codeforces.Contests;

import java.util.*;

public class C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; ++i) {
			int len = sc.nextInt();
			int dis = sc.nextInt();
			String curr = sc.next();
			if(allEquals(curr, '1')) {
				System.out.println("0");
				continue;
			}else if(allEquals(curr, '0')) {
				int ans = 0;
				while(len >= 0) {
					ans++;
					len-=dis+1;
				}
				System.out.println(ans);
				continue;
			}
		}
	}
	
	public static boolean allEquals(String b, char c) {
		for(int i = 1; i < b.length(); ++i)
			if(b.charAt(i) != c)
				return false;
		return true;
	}
}
