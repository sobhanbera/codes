package hackerrank;

import java.util.Scanner;

public class SubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "{";
        String largest = "";
        for(int i=0, j=k; i<s.length() - k + 1; i++, j++) {
        	String sub = s.substring(i,j);
        	if(sub.compareTo(largest) > 0)
        		System.out.println("largest updates : " + sub);
        		largest = sub;
        }
        for(int i=0, j=k; i<s.length() - k + 1; i++, j++) {
        	String sub = s.substring(i,j);
        	if(sub.compareTo(smallest) < 0)
        		System.out.println("smallest updates : " + sub);
        		smallest = sub;
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
