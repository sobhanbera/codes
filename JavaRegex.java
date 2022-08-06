package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ip = scanner.next();
		String regex = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";
		String regex2 = regex + "." + regex + "." + regex + "." + regex;
		Pattern pattern = Pattern.compile(regex2);
		Matcher matcher = pattern.matcher(ip);
		if(matcher.find())
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
