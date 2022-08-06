import java.util.*;

public class A110{

    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int sum = 0;
        for(int i=0; i<num.length(); i++){
            if(num.charAt(i) == '7' || num.charAt(i) == '4')
                sum += 1;
        }
        if(sum == 7 || sum == 4)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
