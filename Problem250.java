import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.math.BigInteger;

public class Problem250{
	static List<BigInteger> ll = new LinkedList<>();
	
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		addElements();
		printElements();
		String s = "00000000000000000000000000000000000000";
		System.out.println(s.length());
		//printSubsets();
	}
	
	static void printSubsets(){ 
        int n = ll.size();
        for (int i = 0; i < (1<<n); i++){ 
            System.out.print("{ ");
            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) > 0)
                    System.out.print(ll.get(j) + " ");
            System.out.println("}");
        } 
    }
    
    public static void addElements(){
		BigInteger bi;
		ll.add(power(new BigInteger("1000"), 1000));
		//for(int i = 1; i <= 1000; i++){
		//	bi = BigInteger.valueOf(i);
		//	bi = power(bi, i);
		//	ll.add(bi);
		//}
	}
	
	public static BigInteger power(BigInteger bi, int i){
		BigInteger res = BigInteger.ONE;
		for(int j = 1; j < bi.intValue(); j++){
			res = res.multiply(bi);
		}
		return res;
	}
	
	public static void printElements(){
		for(int i = 0; i < ll.size(); i++){
			System.out.println(ll.get(i));
		}
	}
}
