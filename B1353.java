import java.io.*;
import java.util.*;
import java.math.*;

public class B1353 {

	public static void main(String[] string) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int nr = 0; nr < t; ++nr) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];

			for(int i = 0; i < n; ++i) {
				a[i] = sc.nextInt();
			}
			for(int i = 0; i < n; ++i) {
				b[i] = sc.nextInt();
			}
			
			for(int i = 0; i < k; ++i) {
				Arrays.sort(a);
				Arrays.sort(b);
				if(a[0] < b[b.length -1]) {
					int temp = a[0];
					a[0] = b[b.length - 1];
					b[b.length -1] = temp;
				}
			}
			int sum = 0;
			for(int i = 0; i < n; ++i) {
				sum += a[i];
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
