package codeforces;

import java.util.*;

public class A96{

    public static void main(String... strings){
        Scanner sc = new Scanner(System.in);
        String players = sc.next();

        if(dangerous(players))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean dangerous(String players){
        for(int i=0; i<players.length(); i++){
            int sum = 1;
            boolean found = false;
            char Ichar = players.charAt(i);
            for(int j=i+1; j<players.length(); j++){
                if(players.charAt(j) == Ichar)
                    sum += 1;
                else
                    break;
                if(sum >= 7){
                    found =  true;
                    return found;
                }
            }
            if(found)
                break;
        }
        return false;
    }
}
