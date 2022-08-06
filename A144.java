package codeforces;

import java.util.Scanner;

public class A144 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		int min = 101, max = 0, mini = 0, maxi = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] >= max) {
				max = arr[i];
				maxi = i;
			}
			if(arr[i] <= min) {
				min = arr[i];
				mini = i;
			}
		}
		sc.close();
		if(maxi > mini)
			mini++;
		
		int ans = maxi + n - 1 - mini;
		System.out.println(ans);
		
	}
}
