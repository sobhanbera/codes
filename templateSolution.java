import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
	static boolean GOT = true;
	static void solve(long time) throws IOException {
		
	}
	
	public static void main(String[] sargs) throws IOException {
		long t = 1;
		if(GOT)
			t = nextLong();
		for(long nr = 1; nr <= t; ++nr)
			solve(nr);
		out.flush();
	}
	
	static void nextToken() throws IOException {
		st.nextToken();
	}
	
	static String next() {
		return sc.next();
	}
	
	static String nextLine() {
		return sc.nextLine();
	}
	
	static int nextInt() throws IOException {
		nextToken();
		return (int) st.nval;
	}
	
	static long nextLong() throws IOException {
		nextToken();
		return (long) st.nval;
	}
	
	static float nextFloat() throws IOException {
		nextToken();
		return (float) st.nval;
	}
	
	static double nextDouble() throws IOException {
		nextToken();
		return (double) st.nval;
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
	static StreamTokenizer st = new StreamTokenizer(br);
	static PrintWriter out = new PrintWriter(System.out);
}
