package Spog;

import java.util.*;

public class ADDREV {

	public static void main(String... arg) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i =0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(Integer.parseInt(reverseInt(Integer.parseInt(reverseInt(a)) + Integer.parseInt(reverseInt(b)))));
		}
		sc.close();
	}
	
	public static String reverseInt(int a) {
		String num = String.valueOf(a);
		String res = "";
		for(int i = num.length()-1; i >= 0; i--)
			res += String.valueOf(num.charAt(i));
		
		return res;
	}
}
