import java.io.*;
import java.util.*;
import java.math.*;

public class A707 {

	public static void main(String[] string) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[][] arr = new String[n][m];
		boolean bw = true;
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = sc.next();
				if(arr[i][j].equals("C") || arr[i][j].equals("M") || arr[i][j].equals("Y")) {
					bw = false;
				}
			}
		}
	
		if(bw) 
			System.out.println("#Black&White");
		else
			System.out.println("#Color");
		
		sc.close();
	}
}
