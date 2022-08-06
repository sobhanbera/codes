import java.io.*;
import java.util.*;
import java.math.*;

public class A1348 {

	public static void main(String[] string) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 1; i <= t; ++i) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int j = 1; j <= n; ++j) {
				arr[j-1] = (int)Math.pow(2, j);
			}
			int[] res = new int[n/2];
			int[] res1 = new int[n/2];
			for(int k = 0, j = n - 2; k < n / 2; ++k, --j) {
				res[k] = arr[j];
			}
			for(int j = 0; j < n / 2 - 1; ++j) {
				res1[j] = arr[j];
			}
			res1[res.length - 1] = arr[arr.length - 1];
			
			int sum1 = 0, sum2 = 0;
			for(int j = 0; j < res.length; ++j) {
				sum1 += res[j];
				sum2 += res1[j];
			}
			System.out.println(Math.abs(sum1 - sum2));
		}
	}
}
//blockdata ~ ~-1 ~ {Lock:"Name of password"}


