import java.io.*;
import java.util.*;
import java.math.*;

public class A492 {

	public static void main(String[] string) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i = 1, sum = 0, j = 0;
		while(true) {
			j += i;
			t -= j;
			if(t <  0)
				break;
			++sum;
			++i;
		}
		System.out.println(sum);
		
		sc.close();
	}
}
