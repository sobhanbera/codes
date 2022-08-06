package CP;

import java.util.Scanner;

class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    public static long power(int n, int p) throws java.lang.Exception{
   		if(n==0 && p==0) {
   			System.out.println("java.lang.Exception: n and p should not be zero.");
   		}else if(n<0 || p<0) {
   			System.out.println("java.lang.Exception: n or p should not be negative.");
   		}else {
	    	for(int i=1; i<=p; i++){
	               n *= (long)n;
	        }
	    	return (long)n;
   		}
        
        return (long)n;
    }
    
}

public class PowerException {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}