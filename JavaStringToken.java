package hackerrank;

import java.util.*;

public class JavaStringToken {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, "[ !,?._'@]+");
        int sum = 0;
        
        while(st.hasMoreTokens()) {
        	sum++;
        	al.add(st.nextToken());
        }
        System.out.println(sum);
        while(!al.isEmpty()) {
        	System.out.println(al.get(0));
        	al.removeFirst();
        }
    }
}
