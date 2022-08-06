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

public class B1 {
	static boolean GOT = true;
	static void solve(long time) throws IOException {
		String s = next();
        String REGEX = "R[0-9]+C[0-9]+";
        if(s.matches(REGEX)) {
            int col = Integer.parseInt(s.substring(s.indexOf('C') + 1));
            String res = "";
            char[] c = new char[26];
            for(int i = 65, j = 0; j < 26; ++i, ++j) {
                c[j] = (char) i;
                print(c[j] + " ");
            }
            while(col > 0) {
                int mod = col % 26;
                res += c[mod];
                col -= (col / 26);
            }
            println(res);
        }
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
	
	static void sort(int arr[], int l, int r) { 
		if (l < r) {
			int m = (l + r) / 2;
			sort(arr, l, m);
			sort(arr, m + 1, r);
			merge(arr, l, m, r);
        }
    }
	
	static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0; 
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
        } 
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
