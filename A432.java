import java.io.*;
import java.util.*;
import java.math.*;

public class A432 {
	static boolean GET = false;
	static void solve(int t, int w) throws IOException {
		int n = ni();
		byte te = nb();
		int arr[] = new int[n];

		for(int i = 0; i < n; ++i) {
			arr[i] = ni();
		}
		Arrays.sort(arr);

		int nt = n / 3;
		int[][] teams = new int[nt][3];

		int index = 0;
		for(int i = 0; i < nt; ++i) {
			for(int j = 0; j < 3; ++j) {
				teams[i][j] = arr[index];
				++index;
			}
		}
		int av = possible(teams, te);
		if(av > 0) {
			print(av);
		}else {
			print(0);
		}
	}

	static int possible(int[][] arr, int t) {
		int sum = 0;
		for(int i = 0; i < arr.length; ++i) {
			if(Math.abs(5 - arr[i][0]) >= t && Math.abs(5 - arr[i][1]) >= t && Math.abs(5 - arr[i][2]) >= t) {
				++sum;
			}
		}
		return sum;
	}

	
	//default java template to get started quickly...
	public static void main(String[] string) throws IOException {
		int t = 1;
		if(GET)
			t = ni();
		for(int i = 1; i <= t; ++i)
			solve(t, i);
		out.flush();
	}
	static int ni() {
		return sc.nextInt();
	}
	static byte nb() {
		return sc.nextByte();
	}
	static String str() {
		return sc.next();
	}
	static void print(Object... o) {
		int len = o.length;
		if(String.valueOf(o[len - 1]).equals(" ")) {
			for(int i = 0; i < len - 1; ++i)
				out.print(String.valueOf(o[i]) + " ");
			return;
		}
		for(int i = 0; i < len; ++i)
			out.print(String.valueOf(o[i]));
	}
	static void println(Object... o) {
		int len = o.length;
		if(len == 0) {
			out.println();
			return;
		}
		for(int i = 0; i < len; ++i)
			out.println(String.valueOf(o[i]));
	}
	
	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);
}
