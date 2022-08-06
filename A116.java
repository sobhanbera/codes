package codeforces;

import java.util.*;
import java.io.*;

public class A116{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int stops[] = new int[2];
        int threshold = 0;

        int count = 0;
        for(int i=0; i<t; i++){
            stops[0] = sc.nextInt();
            stops[1] = sc.nextInt();
            count += stops[1] - stops[0];
            threshold = count > threshold ? count : threshold;
        }
        System.out.println(threshold);
    }
}
