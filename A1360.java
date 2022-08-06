import java.io.*;
import java.util.*;
import java.math.*;

public class A1360 {

	public static void main(String[] string) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int nr = 0; nr < t; ++nr) {
			int a = sc.nextInt(), b = sc.nextInt();
			if(a == b) {
				BigInteger area_sq = BigInteger.valueOf(a * 2);
				area_sq = area_sq.multiply(area_sq);
				System.out.println(area_sq);
				continue;
			}
			int l = Math.max(a, b); b = Math.min(a, b);
			if(l % 2 == 0) {
				if(l / 2 == b) {
					BigInteger area = BigInteger.valueOf(l);
					area = area.multiply(area);
					System.out.println(area);
					continue;
				}
			}
			int i = b * 2;
			while(i < l) ++i;
			BigInteger area = BigInteger.valueOf(i);
			area = area.multiply(area);
			System.out.println(area);
		}

		sc.close();
	}
}
