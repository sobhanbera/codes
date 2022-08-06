package hackerrank;

import java.util.Scanner;

public class JavaBigDecimal {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
      	for(int i=0; i<n ;i++) {
      		boolean sorted = true;
      		for(int j=0; j<n-1-i; j++) {
      			if(Double.valueOf(s[j]) < Double.valueOf(s[j+1])) {
      				String temp = s[j+1];
      				s[j+1] = s[j];
      				s[j] = temp;
      				sorted = false;
      			}
      		}
      		if(sorted)
      			break;
      	}

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
	}
}
