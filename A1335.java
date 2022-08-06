import java.util.*;

public class A1335{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++){
			int can = sc.nextInt();
			int a = (can / 2) + 1;
			System.out.println(can - a);
		}
		sc.close();
	}
}