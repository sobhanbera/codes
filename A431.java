import java.io.*;
import java.util.*;
import java.math.*;

public class A431 {

	public static void main(String[] string) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[4];
        String s = br.readLine();
        String[] a = s.split(" ");
        for(int i = 0; i < 4; ++i) {
            arr[i] = Integer.parseInt(a[i]);
        }
        
        s = br.readLine();
        int sum = 0;
        for(int i = 0; i < s.length(); ++i) {
            sum += arr[Integer.parseInt(String.valueOf(s.charAt(i)))-1];
        }
        System.out.println(sum);
        br.close();
	}
}
