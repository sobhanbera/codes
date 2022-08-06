import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;

public class A1220 {
	static boolean GOT = false;
	static void solve(long time) throws IOException {
	    int a = nextInt();
        String s = next();
        int o = numOf(s, 'o'), n = numOf(s, 'n'), e = numOf(s, 'e'), r = numOf(s, 'r'), z = numOf(s, 'z');
        int numOf1s = min(o, n, e);
        String res = "";
        for(int i = 0; i < numOf1s; ++i) {
            res += "1";
        }
        o -= numOf1s; n -= numOf1s; e -= numOf1s;
        int numOf0s = min(z, e, r, o);
        for(int i = 0; i < numOf0s; ++i) {
            res += "0";
        }
        for(char c : res.toCharArray()) {
            print(c + " ");
        }
	}

    static int numOf(String s, char c) {
        int sum = 0;
        for(char a : s.toCharArray()) {
            if(a == c)
                ++sum;
        }
        return sum;
    }
	
	public static void main(String[] sargs) throws IOException {
		long t = 1;
		if(GOT)
			t = nextLong();
		for(long nr = 1; nr <= t; ++nr)
			solve(nr);
		out.flush();
	}
	
	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);
	
	//input functions
	static String next() {
		return sc.next();
	}
	
	static String nextLine() throws IOException {
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
	
	//print functions
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
	
	//math functions
	static int min(int...n) {
		int res = 0;
		for(int i = 0; i < n.length - 1; ++i)
			res = Math.min(n[i], n[i + 1]);
		return res;
	}
	
	static int max(int...n) {
		int res = 0;
		for(int i = 0; i < n.length - 1; ++i)
			res = Math.max(n[i], n[i + 1]);
		return res;
	}
	
	static int abs(int n) {
		return Math.abs(n);
	}
}
