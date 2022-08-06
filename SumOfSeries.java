package CP;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);

        int m = s.nextInt();
        for(int i=0; i<m; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            int n = s.nextInt();
            int tempB = 0;
            int sum = 0;

            for(int j=0;j<n;j++) {
            	
            	for(int k=0;k<=j;k++) {
            		int t = (int) Math.pow(2, k)*b;
            		tempB += t;
            	}
            	sum += a + tempB;
            	System.out.print(sum+" ");
            	tempB=0;
            }
            System.out.println();
            a=b=n=tempB=sum=0;
        }
    }
}
/*
2
0 2 10
5 3 5
*/