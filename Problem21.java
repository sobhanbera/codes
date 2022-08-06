package projectEuler;

import java.util.*;

public class Problem21 {

	public static void main(String... args){
		
		int sum = 0;
		for(int i = 1; i <= 10000; ++i){
			if(isAmicable(i)){
				
			}
		}
		System.out.println(sum);
	}
	
	public static boolean isAmicable(int num){
		if(num == 1)
			return true;
		int sum = 0;
		for(int i = 1; i <= num/2; ++i)
			if(num % i == 0)
				sum += i;
		
		int thisSum = 0;
		for(int i = 1; i <= sum/2; ++i)
			if(sum % i == 0)
				thisSum += i;
		return thisSum == num;
	}
}
