import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.math.BigInteger;

public class A711 {
	static boolean GOT = false;
	static void solve(long time) throws IOException {
		int n = nextInt();
        String[] arr = new String[n];
        boolean notFound = true;
        for(int i = 0; i < n; ++i) {
            arr[i] = next();
            if(arr[i].contains("OO") && notFound) {
                notFound = false;
                StringBuilder sb = new StringBuilder(arr[i]);
                if(arr[i].substring(0, 2).equals("OO")) {
                    arr[i] = replace(arr[i], 1);
                    continue;
                }
                if(arr[i].substring(3).equals("OO")) {
                    arr[i] = replace(arr[i], 3);
                    continue;
                }
            }
        }
        if(!notFound) {
            println("YES");
            for(int i = 0; i < n; ++i) {
                println(arr[i]);
            }
        }else {
            println("NO");
        }
	}

    static String replace(String s, int n) {
        if(n == 1) {
            String res = "++";
            for(int i = 2; i < 5; ++i) {
                res += String.valueOf(s.charAt(i));
            }
            return res;
        }
        String res = "";
        for(int i = 0; i < 3; ++i) {
            res += String.valueOf(s.charAt(i));
        }
        res += "++";
        return res;
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
