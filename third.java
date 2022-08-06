package codeforcesContest;

import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int d = 0;
			for(int j = 0; j < n ; j++) {
				String curr = Integer.toBinaryString(j);
				String next = Integer.toBinaryString(j+1);
				System.out.println(curr +  " " + next);
				d += diff(curr, next);
				System.out.println(d);
			}
			System.out.println(d);
		}
	}
	
	public static int diff(String a, String b) {
		int res = 0;
		int al = a.length();
		int bl = b.length();
		for(int i = a.length()-1; i >= 0; i--) {
			try {
				if(a.charAt(i) != b.charAt(i))
					res += 1;
			}catch(ArrayIndexOutOfBoundsException e) {
				if(al > bl) {
					for(int k = i; k <al; k++) {
						if(a.charAt(k) == '1')
							res += 1;
					}
				}else if(bl > al) {
					for(int k = i; k<bl;k++) {
						if(b.charAt(k) == '1')
							res+=1;
					}
				}
			}
		}
		return res;
	}
}
