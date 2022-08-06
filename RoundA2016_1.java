package googleKickstart;

import java.io.*;
import java.util.*;

public class RoundA2016_1{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            String name[] = new String[n];
            for(int j = 0; j < n; j++){
                name[j] = br.readLine();
            }
            System.out.println(calculate(name));
        }
    }

    public static String calculate(String name[]){
        int large = -1000000000;
        String res = "";
        for(int i = 0; i < name.length; i++){
            String curr = name[i];
            int size = chara(curr);
            if(large < size){
                large = size;
                res = curr;
            }else if(large == size){
                if(curr.compareTo(res) < 0){
                    res = curr;
                }
            }
        }
        return res;
    }

    public static int chara(String name){
        int[] num = new int[26];
        Arrays.fill(num, 0);
        String s = name.toLowerCase();
        for(char c : s.toCharArray()){
            if(c >= 97 && c <= 122)
            num[c - 'a']++;
        }
        int sum = 0;
        for(int i : num){
            if(i > 0)
                sum++;
        }
        return sum;
    }
}