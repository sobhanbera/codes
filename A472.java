import java.util.*;

public class A472{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 4; i < n; i++){
            int num = n - i;
            if(!isPrime(i)){
                if(!isPrime(num)){
                    System.out.println(i + " " + num);
                    System.exit(0);
                }
            }
        }
        sc.close();

    }

    public static boolean isPrime(int num){
        if(num == 1)
            return false;
        if(num % 2 == 0 && num != 2)
            return false;
        for(int i = 3; i <= Math.sqrt(num); i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}
