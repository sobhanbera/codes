import java.util.*;

public class Task1069 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String dna = sc.next();
		
		int max = Math.max(Math.max(seq(dna, 'a'), seq(dna, 'c')) , Math.max(seq(dna, 'g'), seq(dna, 't')));
		System.out.println(max);
	}
	
	public static int seq(String s, char c){
		s = s.toLowerCase();
		int sum = 0;
		int large = -1;
		for(int i = 0; i <s.length(); ++i){
			if(s.charAt(i) == c)
				++sum;
			else
				sum = 0;
			large = sum >= large ? sum : large;
		}
		return large;
	}
}