package LeetCode;

public class Problem15 {

	public static void main(String[] args) {
		int n[] = {5,1,5,2,5,3,4};
		System.out.println(Solution.repeatedNTimes(n));
	}
}
class Solution {
	
    public static int repeatedNTimes(int[] A) {
        int len = A.length;
        int arr[] = new int[len];
        
        for(int i : A) arr[i]++;
        int res = 0;
        for(int i=0; i<len; i++) {
        	if(arr[i] == len/2) {
        		res = i;
        		break;
        		
        	}
        }
        
        return res;
    }
}
