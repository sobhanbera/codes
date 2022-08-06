package Oops;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointerAlgo {

	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n ;i++) {
			arr[i] = new Scanner(System.in).nextInt();
		}
		
		System.out.println(isThreeSum(arr,0));
		
	}

	public static boolean isThreeSum(int arr[], int n) {
		
		Arrays.sort(arr);
		
		for(int i : arr) {
			System.out.print("-" + i);
		}
		
		for(int i = 0; i < arr.length - 2; i++) {
			if(isTwoSum(arr, -arr[i], i+1)) return true;
		}
		return false;
	}
	
	public static boolean isTwoSum(int arr[] , int n, int i) {
		
		int j = arr.length - 1;
		
		while(i < j) {
			if(arr[i] + arr[j] < n) {
				i++;
			}else if(arr[i] + arr[j] > n) {
				j--;
			}else {
				return true;
			}
		}
		return false;
	}
	
}
