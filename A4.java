package codechef;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n % 2 != 0 || n <= 3) {
			System.out.println("NO");
		}else if(n % 2 == 0 && n >= 4){
			System.out.println("YES");
		}
	}
}
