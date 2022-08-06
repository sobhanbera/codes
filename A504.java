import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.math.BigInteger;

public class A504 {
	static boolean GOT = false;
	static void solve(long time) throws IOException {
		int n = nextInt();
        String a = next(), b = next();
        int sum = 0, t;
        for(int i = 0; i < n; ++i) {
            t = Math.abs(Integer.parseInt(String.valueOf(a.charAt(i))) - Integer.parseInt(String.valueOf(b.charAt(i))));
            if(t > 5) {
                sum += 10 - t;
            }else {
                sum += t;
            }
        }
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
