package codeforces;

import java.util.*;
import java.io.*;

public class A723 {

    private List<Integer> al = new ArrayList<>();
    private List<Integer> ll = new LinkedList<>();
    private Map<Integer, Integer> map = new LinkedHashMap<>();
    private Set<Integer> set = new HashSet<>();
    
    private static Scanner sc = new Scanner(System.in);
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        if(x1 == x2 && x2 == x3){
            System.out.println("0");
        }else {
            if(x1 == x2)
                System.out.println(x3);
            else if(x2 == x3)
                System.out.println(x1);
            else if(x1 == x3)
                System.out.println(x2);
            else{
                
            }
        }
        sc.close();
    }
}