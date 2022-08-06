package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		BitSet a = new BitSet(n);
		BitSet b = new BitSet(n);
		
		for(int i = 0; i < n; i++) {
			a.set(0);
			b.set(0);
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < m; i++) {
			String s = sc.next();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(s == "AND") {
				
			}else if(s == "OR") {
				if(x == 1) {
					a.or(b);
				}else {
					b.or(a);
				}
			}else if(s == "XOR") {
				if(x == 1) {
					a.xor(b);
				}else {
					b.xor(a);
				}
			}else if(s == "FLIP") {
				if(x == 1)
					a.flip(y);
				else
					b.flip(y);
			}else if(s == "SET") {
				if(x == 1)
					a.set(y);
				else
					b.set(y);
			}
			System.out.println(a + " " +  b);
		}
		sc.close();
	}
}
