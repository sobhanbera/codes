import java.util.*;

public class CGR8 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){
		int t = sc.nextInt();

		for(int i = 0; i < t; ++i){
			solution(t);
		}
	}

	public static void solution(int t){
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		if(a == 0 && b == 0)
			return;
		long va = 0, vb = 0;

		long temp = a;
		long i = 0;

		while(true){
			temp += b;
			++i;
			if(temp > n){
				va = i;
				break;
			}
		}
		i = 0;
		temp = b;
		while(true){
			temp += a;
			++i;
			if(temp > n){
				vb = i;
				break;
			}
		}
		if(va < vb)
			System.out.println(va);
		else if(va >= vb)
			System.out.println(vb);
	}
}