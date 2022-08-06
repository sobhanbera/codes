package codeforces;

import java.util.*;

public class A510{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int h = sc.nextInt();

        String ls = "", h1 = "", h2 = "";
        
        for(int i = 1; i <= l; i++){
            if(i % 2 == 0){
                if(i % 4 == 0){
                    if(!h2.isEmpty()){
                        System.out.println(h2);
                    }else{
                        h2 += "#";
                        for(int j = 1; j < h; j++){
                            h2 += ".";
                        }
                        System.out.println(h2);
                    }
                }else{
                    if(!h1.isEmpty()){
                        System.out.println(h1);
                    }else{
                        for(int j = 1; j < h; j++){
                            h1 += ".";
                        }
                        h1 += "#";
                        System.out.println(h1);
                    }
                }
            }else{
                if(!ls.isEmpty()){
                    System.out.println(ls);
                }else{
                    for(int j = 0; j < h; j++){
                        ls += "#";
                    }
                    System.out.println(ls);
                }
            }
        }
	}
}
