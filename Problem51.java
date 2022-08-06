package projectEuler;

public class Problem51 {

	public static void main(String[] args) {
		boolean found = false;
		
		for(int i=1; i <= 1000000; i++) {
			long x2 = i*2;
			if(SOP.isAnagram(String.valueOf(i), String.valueOf(x2))) {
				x2 = i*3;
				if(SOP.isAnagram(String.valueOf(i), String.valueOf(x2))) {
					x2 = i*4;
					if(SOP.isAnagram(String.valueOf(i), String.valueOf(x2))) {
						x2 = i*5;
						if(SOP.isAnagram(String.valueOf(i), String.valueOf(x2))) {
							x2 = i*6;
							if(SOP.isAnagram(String.valueOf(i), String.valueOf(x2))) {
								System.out.println(i);
								break;
							}
						}
					}
				}
			}
		}
	}
}
