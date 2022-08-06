package Data_Structure;

import java.util.*;
import java.util.Map;

public class DSHashMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> score = new HashMap<>();
//		Map<String, Long>
		score.put("name1", 11);
		score.put("name2", 12);
		score.put("name3", 13);
		
		Map<String, Integer> map = new HashMap<>();

		map.put("name4", 15);
		map.put("name5", 15);
		score.putAll(map);

		System.out.println(score.get("name10"));
		
		System.out.println(score);

		score.putIfAbsent("name7", 200);
		
		System.out.println(score.get("name5"));
		System.out.println(score.replace("name1", 12, 2000));
		System.out.println(score.getOrDefault("name6", 12));
		
		System.out.println(score);
		System.out.println(score.keySet());
		System.out.println(score.values());
		
		System.out.println(getHash("CAT"));
		System.out.println(getHash("DOG"));
		System.out.println(getHash("GOD"));
		System.out.println(getHash("BALL"));
	}
	
	public static int getHash(String s) {
		int hash = 0;
		for(int i=0; i<s.length(); i++) {
			hash += s.charAt(i);
		}
		return hash;
	}
}
