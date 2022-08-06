package LeetCode;

import java.util.LinkedList;
import java.util.List;

public class Problem728 {

	public static void main(String[] args) {
		System.out.println(selfDividingNumbers(1, 22));
	}
	
	public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> self = new LinkedList<>();
        for(int i = left; i <= right; i++)
            if(isSelf(i))
            	self.add(i);
        return self;
    }
	
	public static boolean isSelf(int number){
		String num = String.valueOf(number);
		if(num.contains("0"))
    		return false;
        for(int i=0; i<num.length(); i++)
        	if(number % Integer.parseInt(String.valueOf(num.charAt(i))) != 0)
        		return false;
        return true;
    }
}
