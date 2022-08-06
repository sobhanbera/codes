package CP;

public class anagram {

    public static void main(String[] args) {
        // amagram examples are herea..
        String string1 = "abnhso";
        String string2 = "sobhan";
        boolean isAnagram = true;

        int l1[] = new int[256];

        if(string1.length() == string2.length()) {
	        for (char c : string1.toCharArray()) {
	            int index = (int) c;
	            l1[index]++;
	        }
	
	        for (char c : string2.toCharArray()) {
	            int index = (int) c;
	            l1[index]--;
	        }
        }else {
        	isAnagram = false;
        }

        if(isAnagram) {
	        for (int i = 0; i < 256; i++) {
	            if (l1[i] != 0) {
	                isAnagram = false;
	                break;
	            }
	        }
        }

        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

    }
}