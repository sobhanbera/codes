package hackerrank;

import java.util.Scanner;

public class JavaSubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i =0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int ans = 0;
		for(int i = 0; i < n; i++) {
			int sum = 0;
			for(int j = 1; j < n - i + 1; j++) {
				for(int k = 0; k < j; k++) {
//					System.out.println(i + " " + j + " " + k);
					sum += arr[k];
				}
				if(sum < 0) {
					System.out.println(i + " " + sum);
					ans++;
				}
				sum = 0;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
