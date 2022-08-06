package codeforces;

import java.util.Scanner;

public class A339 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		sc.close();
		
		String[] num = n.split("\\+");
		int len = num.length;
		int[] nums = new int[len];
		
		for(int i = 0; i < len; i++)
			nums[i] = Integer.parseInt(num[i]);
		mergeSort(nums, 0, len - 1);
		
		String result = "";
		for(int i = 0; i < len; i++) {
			result += String.valueOf(nums[i]);
			if(i != len - 1)
				result += "+";
		}
		System.out.println(result);
	}
	
	public static void mergeSort(int[] arr, int l, int r) {
		
		if(l < r) {
			int m = (l + r) / 2;
			
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			
			mergeArr(arr, l, m, r);
		}		
	}
	
	public static void mergeArr(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int[] arrL = new int[n1];
		int[] arrR = new int[n2];
		
		for(int i=0; i<n1; i++)
			arrL[i] = arr[l + i];
		for(int i=0; i<n2; i++)
			arrR[i] = arr[m + 1 + i];
		
		int i = 0, j = 0;
		int k = l;
		while(i < n1 && j < n2) {
			if(arrL[i] <= arrR[j]) {
				arr[k] = arrL[i];
				i++;
			}else {
				arr[k] = arrR[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			arr[k] = arrL[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			arr[k] = arrR[j];
			j++;
			k++;
		}
	}

}
