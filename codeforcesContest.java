import java.util.*;

public class codeforcesContest {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i  = 0; i < t; ++i){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int e = 0;
			
			if(a <= 1 && b <= 1){
				System.out.println("0");
				continue;
			}
				
			while(true){
				if(a <= 1 && b <= 1){
					break;
				}else if(a >= 2 && b >= 1){
					//make a shovel...
					a -= 2;
					b -= 1;
					e += 1;
				}else if(a >= 1 && b >= 2){
					//make a sword...
					a -= 1;
					b -= 2;
					e += 1;
				}
			}
			System.out.println(e);
		}
		sc.close();
	}
}
