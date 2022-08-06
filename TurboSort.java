import java.util.*;
public class TurboSort {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int n[] = new int[t];
		
		for(int i  = 0; i < t; ++i){
			n[i] = sc.nextInt();
		}
		Arrays.sort(n);
		print(n);
	}
	public static void print(int n[]){
		for(int i = 0; i < n.length; i++){
			System.out.println(n[i]);
		}
	}
}
