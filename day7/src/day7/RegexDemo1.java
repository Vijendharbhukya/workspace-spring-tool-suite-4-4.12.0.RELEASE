package day7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {

		String regex = "abc", input = "aaaaabcdalsdnfkuyet";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(input);

		System.out.println(matcher.matches());
		System.out.println(matcher.lookingAt());
		System.out.println(matcher.find());

	}

}