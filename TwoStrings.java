package hackerearth;

import java.util.Scanner;
import java.util.Arrays;

public class TwoStrings {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            solution(t);
        }
        sc.close();
    }

    public static void solution(int t){
        String s1 = sc.next();
        String s2 = sc.next();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(isEquals(c1, c2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean isEquals(char[] a, char[] b){
        int len = a.length;
        if(len != b.length)
            return false;
        for(int i = 0; i < len; i++)
            if(a[i] != b[i])
                return false;
        return true;
    }
}