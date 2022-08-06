import java.io.*;
import java.util.*;
import java.math.*;

public class A749 {

	public static void main(String[] string) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		System.out.println(t / 2);
		for(int i = 0; i < t / 2 - 1; ++i) {
			System.out.print("2 ");
		}
		if(t % 2 == 0) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}
		sc.close();
	}
}
