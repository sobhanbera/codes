import java.io.*;
import java.util.*;
import java.math.*;

public class test {

	public static void main(String[] string) {
        LinkedList<LinkedList<Integer>> lli = new LinkedList<>();
        for(int i = 0; i <= 33; ++i) {
            LinkedList<Integer> li = new LinkedList<>();
            for(int j = 0; j <= i; ++j) {
                if(j == 0 || j == i) {
                    li.add(1);
                }else {
                    li.add(lli.get(i-1).get(j-1) + lli.get(i-1).get(j));
                }
            }
            lli.add(li);
        }
        for(int i = 0; i < lli.size(); ++i) {
            System.out.println(lli.get(i));
        }
	}
}

