import java.io.*;
import java.util.*;
import java.math.*;

public class A1294 {
	static boolean GET = true;
	static void solve(int t, int w) throws IOException {
		int a = ni(), b = ni(), c = ni(), n = ni();
		int total = a + b + c + n;
		if(total % 3 == 0) {
			int div = total / 3;
			if(div >= a && div >= b && div >= c) {
				println("YES");
			} else {
				println("NO");
			}
		} else {
			println("NO");
		}
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
