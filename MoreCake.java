package codechef;

import java.util.*;

public class MoreCake {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int family[][] = new int[t][4];
		int po = 0, im = 0;
		
		for(int i = 0; i < t; i++) {
			for(int j = 0; j < 4; j++)
				family[i][j] = sc.nextInt();
			int required = cakesBaked(family[i][1], family[i][2], family[i][3]);
			if(required > family[i][0]) {
				int r = required-family[i][0];
				System.out.println("IMPOSSIBLE " + r);
				im += r;
			}else if(required <= family[i][0]) {
				int r = family[i][0]-required;
				System.out.println("POSSIBLE " + r);
				po += r;
			}
		}
		if(po >= im)
			System.out.println("POSSIBLE");
		else if(po < im)
			System.out.println("IMPOSSIBLE");
	}
	
	public static int cakesBaked(int n, int k, int r) {
		int mul = k * r;
		int sum = k;
		for(int i = 1; i < n; i++) {
			sum += mul;
			mul *= r;
		}
		return sum;
	}
}

