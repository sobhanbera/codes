import java.util.*;

public class A61{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);

		String n = sc.next();
		String m = sc.next();
		String result = "";

		for(int i = 0; i < n.length(); i++){
			if(n.charAt(i) != m.charAt(i))
				result += "1";
			else
				result += "0";
		}

		System.out.println(result);
        sc.close();

	}
}