//297310WY
import java.util.*;
import java.io.*;
import java.math.*;

public class boiler {
	static boiler make = new Solution();
	static boolean take = true;
	
    	static void solve(long t, long i) throws IOException {
			hello	
	 	}
	
    	public static void main(String[] args) throws IOException {
        	String testCase;
        	long t = 1;
        	if(take){
            		testCase = h.sc.next();
            		t = Long.valueOf(testCase);
            		take = false;
        	}
        	for(long i = -1; ++i < t;)
            		solve(t, i);
    }
    
    Scanner sc;
	PrintWriter out;
    BufferedReader br;
	StreamTokenizer in;

    LinkedList<Integer> li;
    ArrayList<Integer> ai;
    Vector<Integer> vi;
	Stack<Integer> si;
    
    BigInteger ONE = BigInteger.ONE;
    BigInteger TEN = BigInteger.TEN;
	BigInteger ZERO = BigInteger.ZERO;
	
	boiler() {
		sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		br = new BufferedReader(new InputStreamReader(System.in));
		in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		li = new LinkedList<>();
		ai = new ArrayList<>();
		vi = new Vector<>();
		si = new Stack<>();
	}
	public void print(Object... O) {
        for(int i = 0; i < O.length; ++i){
			out.print(String.valueOf(O[i]));
        }
    }
    public void println(Object... O) {
        if(O.length == 1 && String.valueOf(O[0]).equals("null")){
			out.print(String.valueOf(O[0]));
            return;
        }
        for(int i = 0; i < O.length; ++i){
			out.print(String.valueOf(O[i]));
        }
    }  
    public int nextInt() throws IOException {
    	in.nextToken();
    	return (int)in.nval;
    }
}

