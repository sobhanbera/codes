import java.io.*;
import java.util.*;
import java.math.*;

public class A1367 {
	static boolean GET = true;
	static void solve(int t, int w) throws IOException {
		String s = str();
		String[] arr = new String[s.length() / 2];
		for(int i = 0, j = 0; i < arr.length; ++i, j += 2) {
			arr[i] = s.substring(j, j + 2);
		}
		String res = String.valueOf(arr[0].charAt(0));
		if(arr.length >= 2) {
			for(int i = 1; i < arr.length - 1; ++i) {
				res += arr[i].charAt(0);
			}
		}
		if(arr.length > 1) {
			res += arr[arr.length - 1];
		}else {
			res += String.valueOf(arr[arr.length - 1].charAt(1));
		}
		println(res);
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
	static long nl() {
		return sc.nextLong();
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
