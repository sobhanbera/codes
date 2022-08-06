package codeforces;

import java.util.Scanner;

public class A977{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        sc.close();

        while(k > 0){
            if(n % 10 == 0){
                n /= 10;
            }else{
                n--;
            }
            k--;
        }

        System.out.println(n);
    }
}
