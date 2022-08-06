import java.io.*;
import java.util.*;
import java.math.*;

public class A1370 {
	static boolean GOT = true;
	static void solve() throws IOException {
        int n = nextInt();
        println(n/2);
	}

    static int gcd(int a, int b) {
        if(a == 0)
            return b;
        return gcd(b % a, a);
    }
	
	//default java template....
	public static void main(String[] sargs) throws IOException {
		long t = 1;
		if(GOT)
			t = nextLong();
		for(long nr = 1; nr <= t; ++nr)
			solve();
		out.flush();
		
	}
	
	//string input functions...
	static String readLine() throws IOException {
		return br.readLine();
	}
	static String next() {
		return sc.next();
	}
	
	//int and long input functions...
	static int nextInt() throws IOException {
		in.nextToken();
		return (int) in.nval;
	}
	
	static long nextLong() throws IOException {
		in.nextToken();
		return (long) in.nval;
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
		for(int i = 0; i < o.length; ++i)
			out.println(o[i].toString());
	}

	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StreamTokenizer in = new StreamTokenizer(br);
	static PrintWriter out = new PrintWriter(System.out);

}
