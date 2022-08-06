import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.HashMap;
import java.util.HashSet;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class A1303 {
	static boolean GOT = true;
	static void solve(long time) throws IOException {
		String s = next();
        int f = s.indexOf("1");
        int l = s.lastIndexOf("1");
        int sum = 0;
        while(f < l) {
            if(s.charAt(f) == '0') {
                ++sum;
            }
            f++;
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
	
	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);
	
	//I/O functions...
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
	
	//some math functions
	static int min(int...n) {
		int res = 2147483647;
		for(int i = 0; i < n.length; ++i)
			res = Math.min(n[i], res);
		return res;
	}
	
	static int max(int...n) {
		int res = -2147483648;
		for(int i = 0; i < n.length; ++i)
			res = Math.max(n[i], res);
		return res;
	}
	
	static int abs(int n) {
		return Math.abs(n);
	}
	
	static long pow(int a, int b) {
		return (long)Math.pow(a, b);
	}
}
