package com.example.demo.twopointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class ValidPalindrome {
  public boolean isPalindrome(String s) {
    String alphaNumericStr = removeNonAlphaNumeric(s);
    return isAlphaNumericPalindrome(alphaNumericStr);
  }

  private boolean isAlphaNumericPalindrome(String s) {
    if (s.length() == 0) return true;

    int begin = 0;
    int end = s.length() - 1;

    while (begin <= end) {
      if (s.charAt(begin++) != s.charAt(end--)) return false;
    }
    return true;
  }

  public static String removeNonAlphaNumeric(String str) {
    return str.chars()
            .filter(c -> Character.isAlphabetic(c) || Character.isDigit(c))
            .map(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : c)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();
  }

}
