import java.util.*;

public class Problem30{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int power = sc.nextInt();
		sc.close();
		long sum = 0;
		for(int i = 1; i <= 10000000; ++i)
			if(digitPower(i, power))
				sum += i;
		System.out.println(sum);
	}
	
	public static boolean digitPower(int upto, int power){
		if(upto == 1)
			return false;
		String num = String.valueOf(upto);
		long sum = 0;
		for(int i = 0; i < num.length(); ++i){
			sum += Math.pow(Integer.valueOf(String.valueOf(num.charAt(i))), power);
		}
		if(sum == upto)
			return true;
		return false;
	}
}
