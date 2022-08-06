import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
import java.util.concurrent.*;

public class github {
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
	
	static boolean equals(String a, String b) {
		return a.equals(b);
	}
	
	static long pow(int a, int b) {
		return (long)Math.pow(a, b);
	}
	
	static void sort(int arr[], int left, int right) { 
		if (left < right) {
			int mid = (left + right) / 2;
			sort(arr, left, mid);
			sort(arr, mid + 1, right);
			MERGE(arr, left, mid, right);
        }
    }
	
	static void MERGE(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int l[] = new int[n1];
        int r[] = new int[n2];
        int k = left;

        for (int i = 0; i < n1; ++i)
            l[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            r[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (l[i] <= r[j]) {
                arr[k] = l[i];
                i++;
            }
            else {
                arr[k] = r[j];
                j++;
            }
            k++;
        }
		
        while (i < n1) {
			arr[k] = l[i];
			i++;
			k++;
        }
		
        while (j < n2) {
            arr[k] = r[j];
            j++;
            k++;
        }
    }
}
