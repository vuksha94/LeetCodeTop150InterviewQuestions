package com.example.demo.hashmap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GroupAnagramsTest {

  GroupAnagrams groupAnagrams = new GroupAnagrams();
  @Test
  void groupAnagrams() {
    String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
    groupAnagrams.groupAnagrams(strings);
  }

  @Test
  void groupAnagramsEmptyString() {
    String[] strings = {""};
    groupAnagrams.groupAnagrams(strings);
  }
}