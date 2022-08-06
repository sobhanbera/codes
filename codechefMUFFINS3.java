import java.util.*;

public class codechefMUFFINS3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
// 		for(int i = 0; i < t; i++){
// 			int n = sc.nextInt();
// 			if(n == 1){
// 				System.out.println("1");
// 			} else{
// 				int la = -1;
// 				for(int j = 2; j <= n; j++){
// 					int a = n % j;
// 					la = a >= la ? j : la;
// 				}
// 				System.out.println(la);
// 			}
// 		}
		for(int i = 0; i < t; i++){
			int n = sc.nextInt();
			System.out.println((n/2)+1);
		}
	}
}
