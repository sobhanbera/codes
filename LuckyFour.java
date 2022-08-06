import java.util.*;

public class LuckyFour{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++){
			String n = sc.next();
			int sum = 0;
			for(int j = 0; j < n.length(); j++){
				if(Integer.parseInt(String.valueOf(n.charAt(j))) == 4){
					sum += 1;
				}
			}
			System.out.println(sum);
		}
	}
}
