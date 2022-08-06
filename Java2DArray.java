package hackerrank;

import java.util.Scanner;

public class Java2DArray {

	public static void main(String...strings) {
		Scanner sc = new Scanner(System.in);
		int hg[][] = new int[6][6];
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				hg[i][j] = sc.nextInt();
			}
		}
		sc.close();
		int sum = 0;
		int large = -1486618624;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if((hg[i][j] != 0 && hg[i+2][j] != 0) || 
						(hg[i][j+1] != 0 && hg[i+2][j+1] != 0) || 
						(hg[i][j+2] != 0 && hg[i+2][j+2] != 0)) {
					sum += hg[i][j] + hg[i][j+1] + hg[i][j+2];
					sum += hg[i+2][j] + hg[i+2][j+1] + hg[i+2][j+2];
					sum += hg[i+1][j+1];
				}
				large = sum >= large ? sum : large;
				sum = 0;
			}
		}
		System.out.println(large);
	}
}
