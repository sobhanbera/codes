import java.io.*;
import java.util.*;
import java.math.*;

public class A1097 {

	public static void main(String[] string) throws IOException {
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		String[] h = new String[5];
		for(int i = 0; i < 5; ++i) h[i] = sc.next();
		
		String[] r = new String[5];
		String[] s = new String[5];
		for(int i = 0; i < 5; ++i) {
			r[i] = h[i].substring(0,1);
			s[i] = h[i].substring(1);
		}
		if(linear(r, t.substring(0, 1)) || linear(s, t.substring(1))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		System.out.println();
		sc.close();
	}

	static boolean linear(String[] s, String x) {
		for(int i = 0; i < 5; ++i) {
			if(s[i].equals(x)) {
				return true;
			}
		}
		return false;
	}
}
