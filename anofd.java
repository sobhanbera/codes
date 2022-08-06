package Source;

import java.util.LinkedList;
import java.util.List;

public class anofd {
	
	public static void main(String[] args) {
		
		List<List<List<String>>> llls = new LinkedList<>();
		
		List<List<String>> lls = new LinkedList<>();
		List<String> ls = new LinkedList<>();
		ls.add("00");
		ls.add("01");
		List<String> ls2 = new LinkedList<>();
		ls2.add("02");
		ls2.add("03");
		List<String> ls3 = new LinkedList<>();
		ls3.add("04");
		ls3.add("05");
		lls.add(ls);
		lls.add(ls2);
		lls.add(ls3);
		
		List<List<String>> lls1 = new LinkedList<>();
		List<String> ls4 = new LinkedList<>();
		ls4.add("10");
		ls4.add("11");
		List<String> ls5 = new LinkedList<>();
		ls5.add("12");
		ls5.add("13");
		List<String> ls6 = new LinkedList<>();
		ls6.add("14");
		ls6.add("15");
		lls1.add(ls);
		lls1.add(ls2);
		lls1.add(ls3);
		
		llls.add(lls);
		llls.add(lls1);
		
		/*
		 * 000
		 * 001
		 * 010
		 * 011
		 * 020
		 * 021
		 * 
		 * 100
		 * 101
		 * 110
		 * 111
		 * 120
		 * 121
		 */

		int i=0,j=0,k=0;
	
		while(i<=1) {
			j=k=0;
			while(j<=2) {
				k=0;
				while(k<=1) {
					System.out.print(llls.get(i).get(j).get(k) + "-");
					k++;
				}
				j++;
			}
			i++;
		}
	}
}
