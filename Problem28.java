import java.util.*;
import java.math.*;

public class Problem28{
	public static void main(String[] rgs){
		Scanner sc = new Scanner(System.in);
		BigInteger last = new BigInteger("1001");
		last = last.multiply(last);
		LinkedList<BigInteger> odds = fillOdd(last);
		System.out.println(odds);
	}
	
	public static LinkedList<BigInteger> fillOdd(BigInteger last){
		BigInteger two = new BigInteger("2");
		LinkedList<BigInteger> odds = new LinkedList<>();
		for(BigInteger bi = BigInteger.ONE; bi.compareTo(last) <= 0; bi.add(two)){
			odds.add(bi);
		}
		return odds;
	}
}
