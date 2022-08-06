package Data_Structure;

import java.util.PriorityQueue;
import java.util.Scanner;

public class TopTenScore{

	public static void main(String[] args) throws Exception{
		PriorityQueue<Integer> topScore = new PriorityQueue<>();
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		System.out.print("How many top scores you need: ");
		int num = scanner.nextInt();
		if(num<n) {
			for(int i=1;i<=n;i++) {
				int m = scanner.nextInt();
				
				if(i<=num) {
					topScore.add(m);
				}else {
					if(topScore.peek() < m) {
						topScore.remove();
						topScore.add(m);
					}
				}
			}
		}else {
			scanner.close();
			throw new Exception("number to top scorer should be less than total players");
		}
		scanner.close();
		if(!topScore.isEmpty())
			System.out.println(topScore);
		
	}
}
