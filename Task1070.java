import java.util.*;
import java.io.*;

public class Task1070 {
		static LinkedList<String> ls = new LinkedList<>();
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				PrintWriter p = new PrintWriter(System.out);
				int n = sc.nextInt();
				String s = "";
				int val = 0;
				boolean get = false;
				String atVal = "";
				get = false;
				for(int i = 1; i <= n; ++i){
						s += String.valueOf(i);
				}
				permute(s, 0, s.length() - 1);
				for(int i = 0; i < ls.size(); ++i){
						if(sumNotOne(ls.get(i))){
								val = i;
								get = true;
								break;
						}
						else get = false;
				}
				if(get){
						atVal = ls.get(val);
						for(int i = 0; i < atVal.length(); ++i)
								System.out.print(atVal.charAt(i) + " ");
				}else{
						System.out.print("NO");
				}

				System.out.println(ls);
				ls.clear();
		}

		public static boolean sumNotOne(String s) {
				for(int i = 0; i < s.length() - 1; ++i){
						if(Integer.parseInt(String.valueOf(s.charAt(i))) + Integer.parseInt(String.valueOf(s.charAt(i+1))) == 1)
								return false;
				}
				return true;
		}

		public static void permute(String s, int l, int r){
				if(l == r)
					ls.add(s);
				else{
						for(int i = l; i <= r; i++){
								s = swap(s, l, i);
								permute(s, l + 1, r);
								s = swap(s, l, i);
						}
				}
		}
	
		public static String swap(String s, int i, int j){
				char temp;
				char[] arr = s.toCharArray();
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				return String.valueOf(arr);
		}
}
