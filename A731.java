import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;

public class A731 {
	static boolean GOT = false;
	static void solve(long time) throws IOException {
		String s = "a" + next();
        short sum = 0;
        for(int i = 0; i < s.length() - 1; ++i) {
            sum += letDif(s.charAt(i), s.charAt(i+1));
        }
        println(sum);
	}

    static int letDif(char a, char b) {
        int dif = Math.abs((b - 96) - (a - 96));
        if(dif > 13) {
            return 26 - dif;
        }
        return dif;
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
