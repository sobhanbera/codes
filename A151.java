import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;

public class A151 {
	static boolean GOT = false;
	static void solve(long time) throws IOException {
		int n = nextInt(), k = nextInt(), l = nextInt(), c = nextInt(), d = nextInt(), p = nextInt();
        int nl = nextInt(), np = nextInt();
        int toMil = k * l / nl;
        int toSli = c * d;
        int toSal = p / np;
        int min = Math.min(toMil, Math.min(toSli, toSal)) / n;
        println(min);
	}
	
	public static void main(String[] sargs) throws IOException {
		long t = 1;
		if(GOT)
			t = nextLong();
		for(long nr = 1; nr <= t; ++nr)
			solve(nr);
		out.flush();
	}
	
	static String next() {
		return sc.next();
	}
	
	static String nextLine() {
		return sc.nextLine();
	}
	
	static String readLine() throws IOException {
		return br.readLine();
	}
	
	static int nextInt() {
		return sc.nextInt();
	}
	
	static long nextLong() {
		return sc.nextLong();
	}
	
	static float nextFloat() {
		return sc.nextFloat();
	}
	
	static double nextDouble() {
		return sc.nextDouble();
	}
	
	static BigInteger nextBigInteger() {
		return sc.nextBigInteger();
	}
	
	static void print(Object...o) {
		if(o[o.length - 1].toString().equals(" "))
			for(int i = 0; i < o.length; ++i)
				out.print(o[i].toString() + " ");
		else
			for(int i = 0; i < o.length; ++i)
				out.print(o[i].toString());
	}

	static void println(Object...o) {
		if(o.length < 1) {
			out.println();
			return;
		}
		for(int i = 0; i < o.length; ++i)
			out.println(o[i].toString());
	}

	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);
}
