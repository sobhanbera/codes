import java.io.*;
import java.util.*;
import java.math.*;

public class A509 {

	public static void main(String[] string) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; ++i) {
			arr[0][i] = 1;
			arr[i][0] = 1;
		}
		for(int i = 1; i < n; ++i) {
			for(int j = 1; j < n; ++j) {
				arr[i][j] = arr[i][j-1] + arr[i-1][j];
			}
		}
		System.out.println(arr[arr.length - 1][arr[arr.length - 1].length - 1]);
		sc.close();
	}
}
