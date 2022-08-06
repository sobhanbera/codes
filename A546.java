package codeforces;

import java.io.*;

public class A546 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] inarr = input.split(" ");
        long[] values = new long[3];
        values[0] = Long.valueOf(inarr[0]); // cost of first banana
        values[1] = Long.valueOf(inarr[1]); // amount the soldier have
        values[2] = Long.valueOf(inarr[2]); // amount of bananas he want to buy
        
        int total = 0;
        for(int i=1; i<=values[2]; i++)
            total += (values[0] * i);
        
        long req = total - values[1];
        if(req < 0)
        	System.out.println("0");
        else
        	System.out.println(req);
    }
}
