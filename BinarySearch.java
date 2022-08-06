package Algorithms;

public class BinarySearch {
	
	public static void main(String... args) {
		int arr[] = {30198, 30453, 31872, 34013, 35506, 35563, 37106, 38142, 38961, 39177, 39795, 40591, 41031, 41777, 42091, 42365, 42825, 44321, 45141, 46043, 46161, 46311, 46425, 48444, 49693, 49773, 50856, 51247, 51528, 51871, 52206, 52783, 53033, 53073, 54050, 54220, 54310, 54512, 55245, 55452, 56853, 57863, 58842, 58961, 59012, 59465, 59950, 60438, 60758, 61884, 62164, 63063, 65263, 66173, 67766, 68287, 72321, 72746, 74251, 74596, 75104, 75602, 75682, 75800, 78472, 80143, 80339, 80405, 80427, 80467, 81251, 81917, 83072, 83232, 83431, 84197, 85315, 85632, 85713, 85968, 86915, 88159, 88283, 90569, 90890, 91138, 91259, 92529, 93342, 93436, 93959, 95096, 95792, 95832, 96597, 96984, 97583, 98130, 98538, 99022};
		long start = System.nanoTime();
		
		System.out.print(binarySearch(arr, 34013) + " ");
		System.out.println("->Binary Search: "+(System.nanoTime() - start));
		
		start = System.currentTimeMillis();
		System.out.print(linearSearch(arr, 34013) + " ");
		System.out.println("->Linear Search: "+(System.nanoTime() - start));
	}
	
	public static boolean linearSearch(int[] arr, int search) {
		int i = 0;
		for(i=0; i<arr.length; i++) {
			if(arr[i] == search) {
				System.out.print(i + " ");
				return true;
			}
		}
		System.out.print(i + " ");
		return false;
	}
	
	public static boolean binarySearch(int[] arr, int toSearch) {
		int start = 0;
		int end = arr.length - 1;
		int mid = start + (end - start) / 2;
		while(start <= end) {
			if(arr[mid] < toSearch)
				start = mid + 1;
			else if(arr[mid] > toSearch)
				end = mid - 1;
			else {
				System.out.print(mid + " ");
				return true;
			}
			
			mid = start + (end - start) / 2;
		}
		System.out.print(mid + " ");
		return false;
	}
}
