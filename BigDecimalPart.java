package CP;

import java.util.Scanner;
import java.math.BigDecimal;

public class BigDecimalPart{

	public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
      	
      	String ss = "0.000001000001200020300004040050050005050505000";
      	BigDecimal bd = new BigDecimal(ss);
        //Write your code here

        int len = s.length;
        for(int i=0; i < len-1; i++){

            for(int j=i; j < len-i-1; j++){
//                if(BigDecimal(s[j]) > BigDecimal.valueOf(s[j+1])){
//                    String temp = s[j+1];
//                    s[j+1] = s[j];
//                    s[j] = temp;
//                }
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
	
}
