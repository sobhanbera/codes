package codeforces;

import java.util.Scanner;

public class A71 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (s.length() > 10) {
				String s1 = String.valueOf(s.charAt(0));
				int s2i = s.length() - 2;
				String s2 = String.valueOf(s2i);
				String s3 = String.valueOf(s.charAt(s.length() - 1));
				System.out.println(s1 + s2 + s3);
			} else
				System.out.println(s);
		}
	}
}

// import java.util.*;
// import java.io.*;

// public class ClassName {
// 	Scanner sc = new Scanner(System.in);
// 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 	ArrayList<Integer> al = new ArrayList<>();
	
// 	public static void main(String... args){
// 		int t = sc.nextInt();
// 		for(int i = 0; i < t; i++){
// 			solution(t);
// 		}
// 	}

// 	public static void solution(int t){

// 	}
// }
