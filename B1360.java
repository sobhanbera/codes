import java.io.*;
import java.util.*;
import java.math.*;

public class B1360 {

	public static void main(String[] string) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int nr = 0; nr < t; ++nr) {
			int n = sc.nextInt();
			int[] te = new int[n];
			for(int j = 0; j < n; ++j) te[j] = sc.nextInt();
			
			Arrays.sort(te);
			long large = 100000000 * 1000000000;
			for(int j = 1; j < n; ++j) {
				large = Math.min(large, Math.abs(te[j] - te[j-1]));
			}
			System.out.println(large);
		}
		sc.close();
	}
}
