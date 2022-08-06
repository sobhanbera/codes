timport java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A9{

    public static void main(String[] args) throws IOException{
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        String die = br.readLine();
        String[] dieVal = die.split(" ");
        int[] rolls = new int[2];
        rolls[0] = Integer.parseInt(dieVal[0]);
        rolls[1] = Integer.parseInt(dieVal[1]);

        int large = rolls[0] >= rolls[1] ? rolls[0] : rolls[1];

        String forDot = large == 1 ? "1/1" : (large == 2 ? "5/6" : (large == 3 ? "2/3" : (large == 4 ? "1/2" : (large == 5 ? "1/3" : (large == 6 ? "1/6" : "0")))));
        System.out.println(forDot);
    }
}
