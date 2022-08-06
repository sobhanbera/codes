package projectEuler;

import java.util.*;
import java.math.*;

public class Problem104{
	
//	public static void main(String... args){
//		BigInteger a = BigInteger.ONE;
//		BigInteger b = BigInteger.ONE;
//		BigInteger c = new BigInteger("1");//new BigInteger("2");		
//		BigInteger threelakh = new BigInteger("329000");
//		BigInteger tent = new BigInteger("100000");
//		BigInteger i = BigInteger.ONE;
//		BigInteger zero = BigInteger.ZERO;
//		BigInteger one = new BigInteger("1");
//		
//		while(true){
//			a = b;
//			b = c;
//			c = a.add(b);
//			if(i.mod(tent) == zero)
//				System.out.println("gone : "+i);
//			if(i.compareTo(threelakh) >= 0) {
//				System.out.println("run : " + i);
//				if(pandigit(a)){
//					System.out.println(i + " >>>> " + a);
//					break;
//				}
//			}
//			i = i.add(one);
//		}
//	}
//
//	public static boolean pandigit(BigInteger a){
//		char f[] = new char[9];
//		char l[] = new char[9];
//		String as = String.valueOf(a);
//		if(as.length() < 9)
//			return false;
//		for(int i = 0 , j = as.length() - 1; i < 9 && j >= as.length() - 9; i++ , --j){
//			f[i] = as.charAt(i);
//			l[i] = as.charAt(j);
//		}
//
//		Arrays.sort(f);
//		Arrays.sort(l);
//		
//		if(f[0] == '0' || l[0] == '0')
//			return false;
//		
//		int fs = 0;
//		int ls = 0;
//		for(int i = 0; i < f.length; i++) {
//			fs += Integer.parseInt(String.valueOf(f[i]));
//			ls += Integer.parseInt(String.valueOf(l[i]));
//		}
//
//		if(fs != 45 || ls != 45)
//			return false;
//		if(fs == 45 && ls == 45) {
//			for(int i = 0; i < 9; i++){
//				System.out.println(i);
//				if(Integer.parseInt(String.valueOf(f[i])) != i+1 || Integer.parseInt(String.valueOf(l[i])) != i+1){
//					return false;
//				}
//			}
//		}
//		return true;
//	}
	
	static final long ONE_BILLION = 1000000000L;
    static final double LOG10 = Math.log(10);
    
    public Problem104() {
        long fI, fIm1, fIm2;
        fIm1 = 1;
        fIm2 = 1;
        double logPhi = Math.log(0.5*(Math.sqrt(5.0)+1))/LOG10;
        double logSqrt5 = 0.5*Math.log(5)/LOG10;
        double logFib = 2*logPhi - logSqrt5;
        System.out.println(logPhi + " " + logSqrt5);
        int i = 2;
        String s;
        do{
            fI = (fIm1 + fIm2) % ONE_BILLION;
            fIm2 = fIm1;
            fIm1 = fI;
            i++;
            logFib += logPhi;
            logFib = fracPart(logFib);
            s = String.valueOf(fI);
            if (s.length() > 9)
              s = s.substring(s.length()-9, s.length());
        } while (!(Anagram(s, "987654321") 
                && Anagram(findLeftEnd(logFib), "987654321")));
        System.out.println("The answer is " + (i));
        System.out.println("Left end:  " + findLeftEnd(logFib));
        System.out.println("Right end: " + s);
    }
    
    private double fracPart(double x){
        return x - (long) x;
    }
    
    private String findLeftEnd(double logFib){
        long leftEnd = (long) (Math.exp(LOG10*logFib)*1.0E8);
        return String.valueOf(leftEnd);
    }
    
    public static void main(String[] args) {
        Problem104 pf = new Problem104();
    }
    
    public boolean Anagram(String a, String b) {
    	boolean isAnagram = true;

        int l1[] = new int[256];

        if(a.length() == b.length()) {
	        for (char c : a.toCharArray()) {
	            int index = (int) c;
	            l1[index]++;
	        }
	
	        for (char c : b.toCharArray()) {
	            int index = (int) c;
	            l1[index]--;
	        }
        }else {
        	isAnagram = false;
        }

        if(isAnagram) {
	        for (int i = 0; i < 256; i++) {
	            if (l1[i] != 0) {
	                isAnagram = false;
	                break;
	            }
	        }
        }

        return isAnagram;
    }
    
}
