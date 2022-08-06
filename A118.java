package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A118 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String regex = "[aeiouAEIOU]";
		s.replace(regex, "");
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(s);
		System.out.println(s);
		String result = "";
		char[] vowel = {'a','e','i','o','u'};
		for(char c : s.toCharArray()) {
			System.out.print("."+String.valueOf(c));
		}
	}
}
