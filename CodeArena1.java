package hackerearth;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.InputMismatchException; 
public class CodeArena1 {  
	
	private static Scan scanner = new Scan(System.in); 
	
	private static Print printer = new Print();  
	
	public static void main(String args[]) throws Exception { 
		init(); 
		process();  
		printer.close(); 
	}  
	
	private static BigInteger[] rolls = new BigInteger[1005]; 
	
	private static void init() throws IOException { 
		rolls[0] = BigInteger.valueOf(1);
		for (int i = 1; i < rolls.length; i++) { 
			rolls[i] = rolls[i-1].multiply(BigInteger.valueOf(2)); 
		}  
	}
	
	public static void process() throws IOException { 
		int t = scanner.readInt();
		for (int i = 0; i < t; i++) {
			int n = scanner.readInt();
			int m = scanner.readInt(); 
			printDiceRollNeeded(n, m);
		}
	} 
	
	private static void printDiceRollNeeded(int n, int m) throws IOException {
		printer.println(rolls[n+1].subtract(rolls[m+1]) + ".00"); 
	} 
	
	static class Print { 
		private final BufferedWriter bw;  
		
		public Print() { 
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		}  
		
		public void print(Object object) throws IOException { 
			bw.append("" + object); 
		}  
		
		public void println(Object object) throws IOException { 
			print(object); bw.append("\n"); 
		}  
		
		public void close() throws IOException { 
			bw.close(); 
		} 
	} 
	
	static class Scan {
		
		private byte[] buff = new byte[1024]; 
		
		private int index; 
		
		private InputStream inputStream; 
		
		private int total;  
		
		public Scan(InputStream stream) { 
			inputStream = stream; 
		}  
		
		private int scan() throws IOException { 
			if (total < 0) throw new InputMismatchException(); 
			if (index >= total) { 
				index = 0; 
				total = inputStream.read(buff); 
				if (total <= 0) return -1; 
				} 
			return buff[index++]; 
		}  
		
		public final int readInt() throws IOException { 
			int c = scan(); 
			boolean neg = false; 
			while (isWhiteSpace(c)) { 
				c = scan(); 
			} 
			char d = (char) c; 
			if (d == '-') { 
				neg = true; 
				c = scan(); 
			} 
			int res = 0;
			do { 
				res *= 10; 
				res += c - '0';
				c = scan(); 
			} while (!isWhiteSpace(c)); 
			if (neg) 
				return -res;
			return res; 
		}
		
		public final String readString() throws IOException { 
			int c = scan(); 
			while (isWhiteSpace(c)) {
				c = scan(); 
			}
			StringBuilder res = new StringBuilder(); 
			do { res.append((char) c); c = scan(); 
		} while (!isWhiteSpace(c)); 
			return res.toString(); 
		} 
		
		public final long readLong() throws IOException { 
			int c = scan();
			boolean neg = false; 
			while (isWhiteSpace(c)) { 
				c = scan();
			} 
			char d = (char) c;
			if (d == '-') { 
				neg = true; 
				c = scan(); 
			} long res = 0; 
			do { 
				res *= 10; 
				res += c - '0'; 
				c = scan(); 
			} while (!isWhiteSpace(c));
				if (neg) return -res; 
			return res; 
		} 
		
		private boolean isWhiteSpace(int n) { 
			if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) 
				return true; 
			return false; 
		} 
		
		public final char readChar() throws IOException { 
			int c = scan(); 
			while (isWhiteSpace(c)) { 
				c = scan(); 
			} 
			return (char) c;
		}
	}
}






