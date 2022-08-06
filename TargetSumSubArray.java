package CP;

import java.util.HashSet;
import java.util.Set;

public class TargetSumSubArray {

	public static void main(String[] args) {
		
		int a[] = {2, 1, -3, 4, 2};
		boolean found = false;
		
//		for(int i = 0; i<a.length; i++) {
//			int sum = 0;
//			for(int j = i; j<a.length; j++) {
//				sum += a[j];
//				if(sum == 0) {
//					found = true;
//					break;
//				}
//			}
//			if(found) break;
//		}
		
		Set<Integer> set = new HashSet<>();
		int target = 6;
		int sum = 0;
		for(int e : a) {
			set.add(sum);
			sum += e;
			if(set.contains(sum-target)) {
				found = true;
				break;
			}
		}
		
		System.out.println("Found The Sum :" + found);
	}
}
