import java.io.*;
import java.util.*;
import java.math.*;

public class A490 {

	public static void main(String[] string) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		int s1 = 0, s2 = 0, s3 = 0;
		for(int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
			if(arr[i] == 1)
				++s1;
			else if(arr[i] == 2)
				++s2;
			else
				++s3;
		}
		if(s1 == 0 || s2 == 0 || s3 == 0) {
			System.out.println(0);
			System.exit(0);
		}
		
		int no_of_teams = Math.min(Math.min(s1, s2), s3);
		System.out.println(no_of_teams);
		for(int i = 0; i < no_of_teams;++i) {
			for(int j = 0; j < n; ++j) {
				if(arr[j] == 1) {
					System.out.print((j + 1) + " ");
					arr[j] = 0;
					break;
				}
			}
			for(int j = 0; j < n; ++j) {
				if(arr[j] == 2) {
					System.out.print((j + 1) + " ");
					arr[j] = 0;
					break;
				}
			}
			for(int j = 0; j < n; ++j) {
				if(arr[j] == 3) {
					System.out.print((j + 1) + " ");
					arr[j] = 0;
					break;
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
