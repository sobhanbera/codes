import java.io.*;
import java.util.*;
import java.math.*;

public class B1367 {

	public static void main(String[] string) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int nr = 0; nr < t; ++nr) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; ++i) arr[i] = sc.nextInt();
			
			int even = 0, odd = 0;
			for(int i = 0; i < n; ++i) {
				if(arr[i] % 2 == 0 && i % 2 == 1)
					++even;
				else if(arr[i] % 2 == 1 && i % 2 == 0)
					++odd;
			}
			if(even == odd)
				System.out.println(even);
			else
				System.out.println("-1");
		}
		sc.close();
	}
}
