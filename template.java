import java.util.*;
import java.io.*;
import java.math.*;

public class template{
	
	public static void main(String[] args) throws IOException{
		long t = 1;
		boolean take = false;
		if(take) {
			t = nextInt();
			print("", "take in true");
		}
		
		for(long i = 1; i <= t; i++){
			//solve...
			int len = nextInt();
			int[] arr = new int[len];
			long sum = 0;
			for(int j = 0; j < arr.length; j++)
				arr[j] = nextInt();
			if(len > 1){
				for(int j = 1; j < len; j++){
					if(arr[j] < arr[j-1]){
						sum += Math.abs(arr[j-1] - arr[j]);
						arr[j] = arr[j-1];
					}
				}
				out.println(sum);
			}else{
				out.print("0");
			}				
		}
		
		out.flush();
	}

	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StreamTokenizer in = new StreamTokenizer(br);
	static LinkedList<Integer> li = new LinkedList<>();
	static ArrayList<Integer> ai = new ArrayList<>();
	static Vector<Integer> vi = new Vector<>();
	static Stack<Integer> si = new Stack<>();

	static BigInteger ZERO = BigInteger.ZERO;
	static BigInteger ONE = BigInteger.ONE;
	static BigInteger TEN = BigInteger.TEN;
	
	static int nextInt() throws IOException {
		in.nextToken();
		return (int)in.nval;
	}
	static long nextLong() throws IOException {
		in.nextToken();
		return (long)in.nval;
	}

	static void print(String t, Object... o){
		if(t.equals("f"))
			for(int i = 0; i < o.length; ++i)
				out.printf(t, o[i].toString());
		else if(t.equals(" "))
			for(int i = 0; i < o.length; ++i)
				out.print(o[i].toString() + " ");
		else if(t.equals("l"))
			for(int i = 0; i < o.length; ++i)
				out.println(o[i].toString());
		else if(!t.equals("") && t != null){
			for(int i = 0; i < o.length; ++i){
				if(i != o.length-1){
					out.print(o[i].toString() + " " + t + " ");
					continue;
				}
				out.println(o[i]);
			}
		}
	}	
}


