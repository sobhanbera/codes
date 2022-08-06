import java.io.*;
import java.util.*;
import java.math.*;

public class A935 {

	public static void main(String[] string) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int sum = 0;
		int i = 1;
		while(i < t) {
			if((t - i) % i == 0) {
				++sum;
			}
			++i;
		}
		System.out.println(sum);
		sc.close();
	}
}
