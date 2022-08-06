import java.util.*;
import java.io.*;
import java.math.*;

public class FirstAndLastDigit {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i  = 0; i < t; ++i){
			String num = sc.next();
			int sum = Integer.parseInt(String.valueOf(num.charAt(0))) + Integer.parseInt(String.valueOf(num.charAt(num.length()- 1)));
			System.out.println(sum);
		}
	}
}
