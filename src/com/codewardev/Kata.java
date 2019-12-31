package com.codewardev;

// https://www.codewars.com/kata/valid-phone-number/train/java

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {

	public static boolean validPhoneNumber(String phoneNumber) {
		Pattern p = Pattern.compile("\\(\\d{3}\\) \\d{3}-\\d{4}");
		Matcher m = p.matcher(phoneNumber);
		return m.matches();
	}

}
