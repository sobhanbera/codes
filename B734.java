import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;

public class B734 {
	static boolean GOT = false;
	static void solve(long time) throws IOException {
		int k2 = nextInt(), k3 = nextInt(), k5 = nextInt(), k6 = nextInt();
        int numOf = Math.min(Math.min(k2, k5), k6);
        int sum = numOf * 256;
        k2 -= numOf; k5 -= numOf; k6 -= numOf;

        numOf = Math.min(k3, k2);
        sum += (32*numOf);
        println(sum);
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
