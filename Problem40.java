package projectEuler;

import java.util.*;

public class Problem40 {

	public static void main(String...args){
		String s = ""; 
		for(int i = 1; i <= 1000000; ++i){
			s += String.valueOf(i);
			if(s.length() > 1000000)
				break;
		}
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(9));
		System.out.println(s.charAt(99));
		System.out.println(s.charAt(999));
		System.out.println(s.charAt(9999));
		System.out.println(s.charAt(99999));
		System.out.println(s.charAt(999999));
	}
}
