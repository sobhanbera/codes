import java.util.*;

public class Problem76{
	
	static int sum = 0;
	
	public static void main(String... args){
		recur(5);
		print(sum);
	}
	
	public static int recur(int n){
		sum += 1;
		if(n == 1)
			return 1;
		return n + recur(n-1);
	}
	
	public static void print(int n){
		System.out.println(n);
	}
}
