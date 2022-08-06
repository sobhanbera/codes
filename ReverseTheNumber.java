package codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseTheNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int num;
	    for(int i=0; i<n; i++){
	        num = sc.nextInt();
	        System.out.println(reverse(num));
	    }
	}
	
	public static String reverse(int num){
	    String str = String.valueOf(num);
	    String result = "";
	    for(int i=str.length()-1; i>=0; i--)
	        result += str.charAt(i);
	    return result;
	}
}
