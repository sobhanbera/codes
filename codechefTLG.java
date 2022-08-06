import java.util.*;

public class codechefTLG{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		HashMap<Integer, Integer> hm = new LinkedHashMap<>();
		hm.put(1, -1);
		hm.put(2, -1);
		for(int i = 0; i < t; i++){
			int p1 = sc.nextInt();
			int p2 = sc.nextInt();
			if(p1 > p2){
				if(hm.get(1) <= (p1 - p2)){
					hm.put(1, p1 - p2);
				}
			}else{
				if(hm.get(2) <= (p2 - p1)){
					hm.put(2, p2 - p1);
				}
			}
		}
		if(hm.get(1) > hm.get(2))
			System.out.println("1 " + hm.get(1));
		else
			System.out.println("2 " + hm.get(2));
	}
}
