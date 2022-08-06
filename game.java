import java.io.*;
import java.util.*;
import java.math.*;

public class game {
    static HashSet<Integer> sob = new HashSet<>();
    static HashSet<Integer> bhu = new HashSet<>();
    static Random r = new Random();
    static boolean sobhan = true;
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] string) throws IOException {
        String c = "y";
        do {
            sobhan = !sobhan;
            int range = level(4);
            int sum = 0;
            System.out.print("Enter a number(1000) : ");
            int y = sc.nextInt();
            if(sobhan && !sob.contains(y)) {
                sob.add(y);
            }else if(!sobhan && !bhu.contains(y)) {
                bhu.add(y);
            }else if(sob.contains(y) || bhu.contains(y)) {
                System.out.println("Please enter a different number: ");
            }
            if(y > 1) {
                for(int i = 0; i < range; ++i) {
                    int s = r.nextInt(100000);
                    if(s % y == 0) {
                        sum++;
                    }
                }
            }else {
                System.out.println("Invalid Input");
                System.exit(0);
            }
            System.out.println("You Got " + sum + " / " + range + " Points.");
            System.out.println((float)(((float)sum * 100) / (float)range) + " %");
            System.out.print("\nWant to play Again (y/n) : ");
            c = sc.next();
        } while(c.contains("y") || c.contains("Y"));
		sc.close();
	}

    static int level(int n) {
        String s = String.valueOf(n);
        for(int i = 0; i < n; ++i) {
            s += String.valueOf(r.nextInt(9));
        }
        System.out.println("\nYou got lucky number = " + s + "\n");
        return Integer.parseInt(s);
    }
}
