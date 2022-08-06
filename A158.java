package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A158{
	public static void main(String... srgs) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		int n[] = new int[t];
		int k = Integer.parseInt(bf.readLine());
		int i = 0;
		while(i != t) {
			n[i] = Integer.parseInt(bf.readLine());
			i++;
		}
		int count = 0;
		for(i=0; i<t;i++) {
			if(n[i] >= n[k-1] &&(n[k-1] != 0 || n[i] != 0))
				count++;
			else if(n[i] < n[k-1])
				break;
		}
		System.out.println(count);
	}
}
