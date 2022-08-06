import java.io.*;
import java.util.*;
import java.math.*;

public class boilerplatecode {
	static boolean GET = true;
	static void solve(int t, int w) throws IOException {
		
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
	static int ni() throws IOException {
		return sc.nextInt();
	}
	static long nl(String t) throws IOException {
		return sc.nextLong();
	}
	static String str() throws IOException {
		return sc.next();
	}
	static void print(Object... o) throws IOException {
		int len = o.length;
		if(String.valueOf(o[len - 1]).equals(" ")) {
			for(int i = 0; i < len; ++i)
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

