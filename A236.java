package codeforces;

import java.util.Scanner;

public class A236 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.next();
        sc.close();
        name = name.toLowerCase();
        
        int[] arr = new int[26];

        for(int i=0; i<name.length(); i++){
            arr[name.charAt(i) - 'a'] += 1;
        }
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0)
                sum += 1;
        }
        if(sum % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
