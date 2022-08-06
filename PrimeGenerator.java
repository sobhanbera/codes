import java.util.Scanner;

class PrimeGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long a, b;

        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            primes(a, b);
        }
    }

    public static void primes(long a, long b) {
        for (long i = a; i <= b; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    public static boolean isPrime(long num) {
        if (num % 2 == 0)
            return false;
        for (long i = 2; i < num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
