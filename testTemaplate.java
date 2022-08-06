import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;

public class testTemaplate {
	
	static Helper so = new Helper(true);
	void solve(long time) throws IOException {
		
	}
	
	public static void main(String[] sargs) throws IOException {
		long t = 1;
		if(so.GOT)
			t = so.nextLong();
		for(long nr = 1; nr <= t; ++nr)
			solve(nr);
		so.flush();
	}
}

class Helper {
	
	boolean GOT;
	Scanner sc;
	BufferedReader br;
	PrintWriter out;
	
	Helper(boolean b) {
		sc = new Scanner(System.in);
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		GOT = b;
	}
		
	//input functions
	String next() {
		return sc.next();
	}
	
	String nextLine() throws IOException {
		return br.readLine();
	}
	
	int nextInt() {
		return sc.nextInt();
	}
	
	long nextLong() {
		return sc.nextLong();
	}
	
	float nextFloat() {
		return sc.nextFloat();
	}
	
	double nextDouble() {
		return sc.nextDouble();
	}
	
	BigInteger nextBigInteger() {
		return sc.nextBigInteger();
	}
	
	//print functions
	void print(Object...o) {
		if(o[o.length - 1].toString().equals(" "))
			for(int i = 0; i < o.length; ++i)
				out.print(o[i].toString() + " ");
		else
			for(int i = 0; i < o.length; ++i)
				out.print(o[i].toString());
	}
	
	void println(Object...o) {
		if(o.length < 1) {
			out.println();
			return;
		}
		for(int i = 0; i < o.length; ++i)
			out.println(o[i].toString());
	}
	
	//math functions
	int min(int...n) {
		int res = 0;
		for(int i = 0; i < n.length - 1; ++i)
			res = Math.min(n[i], n[i + 1]);
		return res;
	}
	
	int max(int...n) {
		int res = 0;
		for(int i = 0; i < n.length - 1; ++i)
			res = Math.max(n[i], n[i + 1]);
		return res;
	}
	
	int abs(int n) {
		return Math.abs(n);
	}
	
	void flush() {
		out.flush();
	}
}
