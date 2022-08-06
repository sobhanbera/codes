package codeforces;

import java.util.Scanner;

public class A381 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num[] = new int[n];
		
		for(int i = 0; i < n; i++)
			num[i] = sc.nextInt();
		
		sc.close();
		
		int l=0, r=num.length-1;
		int sp = 0, dp = 0;
		
		boolean s = true;
		
		while(l <= r) {
			if(num[l] >= num[r]) {
				if(s)
					sp += num[l];
				else
					dp += num[l];
				l++;
			}else if(num[r] > num[l]){
				if(s)
					sp += num[r];
				else
					dp += num[r];
				r--;
			}
			if(s)
				s = false;
			else
				s = true;
		}
		
		System.out.print(sp + " " + dp);
	}
}
