import java.util.*;

//optimized
public class Task1083 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		Arrays.fill(arr, 1);
		
		for(int i = 0; i < n-1; ++i){
			int val = sc.nextInt();//1 arr[0]
			arr[val-1] = 0;
		}
		for(int i = 0; i < n; ++i){
			if(arr[i] == 1){
				System.out.println(i+1);
				break;
			}
		}
	}
}

/*
public class Task1083 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n-1];
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i = 1; i <= n; ++i){
			if(binarySearch(arr, i) >= 0){
				continue;
			}else{
				System.out.println(i);
				break;
			}
		}
	}
	
	public static int binarySearch(int arr[], int x){
		int l = 0;
		int r = arr.length - 1;
		int m = (r + l) / 2;
		while(l <= r){
			if(arr[m] == x)
				return m;
			else if(arr[m] > x)
				r = m - 1;
			else if(arr[m] < x)
				l = m + 1;
			m = (r + l) / 2;
		}
		return -1;
	}
}*/