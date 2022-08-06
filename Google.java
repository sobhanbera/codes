import java.util.*;

public class Google{
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String... args){
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            sc.next();
            String[] name = new String[n];
            for(int j = 0; j < n; i++){
                name[j] = sc.nextLine();
                name[j] = name[j].replace(" ","");
                System.out.println(name[j]);
            }
        }
    }
    
    public static void Solution(int t){
        int n = sc.nextInt();
        sc.next();
        String res = "";
        String ls = "";
        ls = res;
        int large = -1000000000;
        for(int i = 0; i < n; i++){
            String name = sc.nextLine();
            int c = characters(name);
            if(large < c){
                ls = name;
            }
        }
        System.out.println(ls);
    }

    public static int characters(String name){
        int[] num = new int[26];
        Arrays.fill(num, 0);
        String s = name.toLowerCase();
        for(char c : s.toCharArray()){
            if(c >= 97 && c <= 122)
            num[c - 'a']++;
        }
        int sum = 0;
        for(int i : num){
            if(i > 0)
                sum++;
        }
        return sum;
    }
}
//javac ProgramFiles\CP\Google.java java Google