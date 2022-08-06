package projectEuler;

public class SOP {

	public static boolean isAnagram(String str0, String str1) {
		
		int len0 = str0.length();
		int len1 = str1.length();
		boolean isAnagram = true;
		if(len0 != len1) {
			isAnagram = false;
			return isAnagram;
		}else {
			char[] c0 = str0.toCharArray();
			char[] c1 = str1.toCharArray();
			int arr[] = new int[256];
			
			for(char c : c0) {
				arr[(int)c]++;
			}
			for(char c : c1) {
				arr[(int)c]--;
			}
			for(int i=0;i<256;i++) {
				if(arr[i] != 0) {
					isAnagram = false;
					break;
				}else {
					isAnagram = true;
				}
			} 
		}
		return isAnagram;
	}
}
