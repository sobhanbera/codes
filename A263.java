package codeforces;

import java.util.Scanner;

public class A263 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num[][] = new int[5][5];
        int p[] = new int[2];

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                num[i][j] = sc.nextInt();
                if(num[i][j] == 1){
                    p[0] = i;
                    p[1] = j;
                }
            }
        }

        p[0] = p[0] == 0 ? 2 : (p[0] == 1 ? 1 : (p[0] == 2 ? 0 : (p[0] == 3 ? 1 : (p[0] == 4 ? 2 : 0))));
        p[1] = p[1] == 0 ? 2 : (p[1] == 1 ? 1 : (p[1] == 2 ? 0 : (p[1] == 3 ? 1 : (p[1] == 4 ? 2 : 0))));
        System.out.println(p[0] + p[1]);
	}
}
