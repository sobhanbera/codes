package others;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String...strings) {
		Scanner scanner = new Scanner(System.in);
		String regex = "(.*)(\\d+)(.*)";
		String word = scanner.nextLine();
		scanner.close();
		Pattern patt = Pattern.compile(regex);
		Matcher matt = patt.matcher(word);
		if(matt.find()) {
			System.out.println("Mathches..");
			String out = word.replace(regex, "~");
			System.out.println(out);
		}else {
			System.out.println("Not Matched...");
		}
	}
}
