package LeetCode;

import java.util.Collections;

public class Problem977 {
	public static void main(String[] args) {
		int[] n = {10,1,-1-4,0,3};
		n = sort(n);
		for(int i : n) {
			System.out.print(i + " ");
		}
	}
	public static int[] sortedSquares(int[] arr) {
        int sq[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            sq[i] = arr[i] * arr[i];
        }
        sq = sort(sq);
        return sq;
    }
	
	public static int[] sort(int[] arr) {
		int a[] = arr;
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			boolean sorted = true;
			for(int j=0; j<n-1-i; j++) {
				if(a[j+1] < a[j]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					sorted = false;
				}
			}
			if(sorted)
				break;
		}
		return a;
	}
}
