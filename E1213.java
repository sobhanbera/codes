import java.io.*;
import java.util.*;
import java.math.*;

public class E1213 {

	static String s1 = "", s2 = "";
	public static void main(String[] string) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		s1 = s; s2 = t;
		String res = "";
		for(int i = 0; i < n; ++i)
			res += "abc";
		permute(res, "");
		System.out.println("NO");
		sc.close();
	}	
	
	static void permute(String s, String a) {
		if(s.length() == 0) {
			if(a.contains(s1))
				return;
			if(a.contains(s2))
				return;
			if(!a.contains(s1)) {
				if(!a.contains(s2)) {
					System.out.println("YES");
					System.out.println(a);
					System.exit(0);
				}
			}
			return;
		}
		
		boolean[] al = new boolean[26];
		for(int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			String p = s.substring(0, i) + s.substring(i + 1);
			if(al[c - 'a'] == false)
				permute(p, a + c);
			al[c - 'a'] = true;
		}
	}
}

