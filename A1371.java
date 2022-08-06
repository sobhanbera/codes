import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

public class A1371 {
	static boolean GOT = true;
	static void solve(long time) throws IOException {
        int n;
        if((n = nextInt()) % 2 == 0) {
            println(n / 2);
        }else {
            println(n/2 + 1);
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
	
	static String stval() {
		try {
			st = new StringTokenizer(br.readLine());
		}catch(IOException e) {
			e.printStackTrace();
		}
		return st.nextToken();
	}
	
	static String readLine() throws IOException {
		return br.readLine();
	}

	static String next() {
		return sc.next();
	}
	
	static int nextInt() {
		return Integer.parseInt(stval());
	}

	static long nextLong() {
		return Long.parseLong(stval());
	}
	
	static float nextFloat() {
		return Float.parseFloat(stval());
	}
	
	static double nextDouble() {
		return Double.parseDouble(stval());
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
	static StringTokenizer st;
	static PrintWriter out = new PrintWriter(System.out);
}
