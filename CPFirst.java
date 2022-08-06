package CP;

public class CPFirst {

	public static boolean isTwoSumArray(int arr[],int n) {
		int i=0, j = arr.length-1;
		
		while(i<j) {
			if(arr[i] + arr[j] > n) {
				j--;
			}else if(arr[i] + arr[j] < n) {
				i++;
			}else {
				System.out.println(arr[i] + "+" + arr[j]);
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,5,6,7,8,9};
		
		System.out.println(isTwoSumArray(arr,5));
		
	}
}
