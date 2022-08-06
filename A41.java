import java.util.*;

public class A41{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        if(reverse(s, t))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean reverse(String s, String t){
        String result = "";
        for(int i = s.length() - 1; i >= 0; i--)
            result += String.valueOf(s.charAt(i));
        return result.equals(t);
    }
}
