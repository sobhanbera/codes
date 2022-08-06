import java.util.*;

public class Problem24 {
	//Answer :: 2783915460
	static Set<String> set = new TreeSet<>();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = "0123456789";
		permute(n, 0, n.length() - 1);
		//Set<String> ans = permutationFinder(n);
		//System.out.println();
		int i = 1;
		//System.out.println(set);
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			if(i >= 1000001){
				break;
			}
			System.out.println(i + " --> " + it.next());
			++i;
		}
	}
	
	private static void permute(String str, int l, int r) {
        if (l == r){
			set.add(str);
		}
        else {
            for (int i = l; i <= r; i++) { 
                str = swap(str, l, i); 
                permute(str, l + 1, r); 
                str = swap(str, l, i);
            } 
        }
        /*if(set.size() >= 1000002)
			return;*/
    } 
  
    /** 
     * Swap Characters at position 
     * @param a string value 
     * @param i position 1 
     * @param j position 2 
     * @return swapped string 
     */
    public static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i]; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    }
	
	/*public static Set<String> permutationFinder(String str) {
        Set<String> perm = new HashSet<String>();
        
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0);
        String rem = str.substring(1);
        Set<String> words = permutationFinder(rem);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }

    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }*/
}
