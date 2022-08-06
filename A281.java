package codeforces;

import java.util.Scanner;

public class A281 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        result += String.valueOf(Character.toUpperCase((str.charAt(0))));

        for(int i=1; i<str.length(); i++){
            result += String.valueOf(str.charAt(i));
        }
        System.out.println(result);
    }
}
