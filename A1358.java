import java.io.*;
import java.util.*;
import java.math.*;

public class A1358 {

	public static void main(String[] string) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int nr = 0; nr < t; ++nr) {
			int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println((int)Math.ceil((double)n * m / 2));
		}
		sc.close();
	}
}
