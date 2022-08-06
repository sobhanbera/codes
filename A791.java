package codeforces;

import java.util.*;

public class A791{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int year = 0;
        while(true){
            a *= 3;
            b *= 2;
            if(a > b){
                year += 1;
                break;
            }
            year += 1;
        }
        System.out.println(year);
    }
}
