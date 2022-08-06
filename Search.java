package searching;

public class Search {
	
	public static void main(String[] args) throws Exception{
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		Search search = new Search();
		System.out.println(search.binary(arr, 14));
	}
	
	public int binary(int arr[], int x) throws Exception{
		if(!isSorted(arr))
			throw new Exception("input array is not in sorted format");
		int len = arr.length;
		if(len >= 1) {
			int mid = len/2;
			int l = 0, r = len;
			while(l<=r) {
				if(arr[mid] == x)
					return mid;
				else if(arr[mid] > x)
					r = mid - 1;
				else if(arr[mid] < x)
					l = mid + 1;
			}
		}
		return -1;
	}
	
	public int search(int arr[], int x) {
		int n = arr.length;
		for(int i = 0; i < n; ++i)
			if(arr[i] == x)
				return i;
		return -1;
	}
	
	@Deprecated
	public boolean isSorted(int arr[]) {
		for(int i = 0; i < arr.length-1; ++i) {
			if(arr[i] > arr[i+1])
				return false;
		}
		return true;
	}
}
