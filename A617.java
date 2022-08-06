package MyQue;

import java.util.*;

public class A617{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        sc.close();

        int step = 0;
        if(pos > 0){
            while(pos != 0){
                step += 1;
                pos = pos >= 5 ? pos - 5 : (pos == 4 ? pos - 4 : (pos == 3 ? pos - 3 : (pos == 2 ? pos - 2 :(pos == 1 ? pos -1 : pos - 0))));
            }
        }
        System.out.println(step);
    }
}
