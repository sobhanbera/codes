package codechef;

import java.util.*;

public class SumOfDigits {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            solution(t);
        }
        sc.close();
    }

    public static void solution(int t){
        String num = sc.next();
        int sum = 0;
        for(int i = sum; i < num.length(); i++)
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        System.out.println(sum);
    }
}