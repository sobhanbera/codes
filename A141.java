import java.util.*;

public class A141{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String an = sc.next();
		String sn = sc.next();
		String fn = sc.next();
		an = an+sn;
		if(isAnagram(an, fn))
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();
	}

	public static boolean isAnagram(String a, String b){
		int len = a.length();
		if(len != b.length()){
			return false;
		}else{
			boolean isAna = true;
			int arr[] = new int[26];
			for(int i = 0; i < len; i++){
				++arr[a.charAt(i) - 'A'];
				--arr[b.charAt(i) - 'A'];
			}
			for(int i : arr){
				if(i != 0){
					isAna = false;
					break;
				}
			}
			return isAna;
		}
	}
}
