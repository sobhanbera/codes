import java.util.*;

public class A59{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        if(mostWordUppercase(word))
            word = word.toUpperCase();
        else
            word = word.toLowerCase();
        System.out.println(word);
    }

    public static boolean mostWordUppercase(String word){
        int up = 0, low = 0;
        for(int i = 0; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i)))
                up++;
            else
                low++;
        }
        return up > low;
    }
}
