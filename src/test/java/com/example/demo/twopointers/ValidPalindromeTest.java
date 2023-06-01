package com.example.demo.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

  private static ValidPalindrome testingClass;

  @BeforeAll
  static void beforeAll() {
    testingClass = new ValidPalindrome();
  }

  @Test
  void isPalindrome_Blank_Yes() {
    String s = "   . ,";
    Assertions.assertTrue(testingClass.isPalindrome(s));
  }
  @Test
  void isPalindrome_Yes() {
    String s = "   . ,D";
    Assertions.assertTrue(testingClass.isPalindrome(s));
  }
  @Test
  void isPalindrome_Not() {
    String s = "   . ,DA";
    Assertions.assertFalse(testingClass.isPalindrome(s));
  }
  @Test
  void isPalindrome_Yes2() {
    String s = "A man, a plan, a canal: Panama";
    Assertions.assertTrue(testingClass.isPalindrome(s));
  }
  @Test
  void isPalindrome_Not2() {
    String s = "race a car";
    Assertions.assertFalse(testingClass.isPalindrome(s));
  }

  @Test
  void removeNonAlphaNumeric() {
    String str =  "A man, a plan, a canal: Panama";
    String exp =  "amanaplanacanalpanama";
    String res = ValidPalindrome.removeNonAlphaNumeric(str);

    Assertions.assertEquals(exp, res);
  }
}