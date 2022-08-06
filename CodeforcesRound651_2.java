import java.util.*;

public class CodeforcesRound651_2 {
    public static void main(String[] args){
        LinkedList<Integer> lli = new LinkedList<>();
        LinkedList<Integer> li = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; ++i){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; ++j)
                arr[j] = j+1;
            
            int len = arr.length;
            for (int j = 0; j < (1<<len); j++){  
                for (int k = 0; k < len; k++){
                    if ((j & (1 << k)) > 0){
                        li.add(arr[k]);
                        if(li.size() >= 3)
                            break;
                    }
                }
                System.out.println("small: " + li);
                if(li.size() == 2){
                    lli.addAll(li);
                }
                li.clear();
            }

            // for (int j=0; j < len; j++){
            //     for (int k=j; k<len; k++) {
            //         for (int l=k; l<=k; l++) {
            //             li.add(arr[k]);
            //             if(li.size() >= 3)
            //             break;
            //         }
            //         if(li.size() >= 3)
            //            break;
            //         System.out.println(li);
            //     }
            // } 

            int large = -1;
            for(int k = 0; k < lli.size(); k+=2)
                large = Math.max(gcd(lli.get(k), lli.get(k+1)), large);
            // System.out.println(lli);
            System.out.println(large);
            lli.clear();

        }
        sc.close();
    }

    public static int gcd(int a, int b){
        int range = Math.min(a, b);
        for(int i = range; i >= 1; --i)
            if(a % i == 0 && b % i == 0)
                return i;
        return 1;
    }
}