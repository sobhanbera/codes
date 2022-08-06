import java.util.*;

public class Problem34{
	//Answer :: 40730
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int upto = sc.nextInt();
		long sum = 0;
		for(int i = 1; i <= upto; ++i){
			if(digitFactorial(i)){
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	public static boolean digitFactorial(int num){
		if(num == 0 || num == 1 || num == 2)
			return false;
		String n = String.valueOf(num);
		int sum = 0;
		for(int i = 0; i < n.length(); ++i){
			sum += factorial(Integer.parseInt(String.valueOf(n.charAt(i))));
		}
		if(sum == num)
			return true;
		return false;
	}
	
	public static int factorial(int num){
		if(num == 0 || num == 1)
			return 1;
		return num * factorial(num - 1);
	}
}
