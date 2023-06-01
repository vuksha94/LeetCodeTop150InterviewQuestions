package com.example.demo.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

  public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>();



    for (int i = 0; i < strs.length; i++) {
      String str = strs[i];

      char[] frequencyArr = new char[26];
      for(int j = 0; j < str.length(); j++){
        frequencyArr[str.charAt(j) - 'a']++;
      }
      String key = new String(frequencyArr);

      if (map.containsKey(key)) {
        map.get(key).add(str);
      } else {
        ArrayList<String> value = new ArrayList<>();
        value.add(str);
        map.put(key, value);
      }
    }

    ArrayList<List<String>> res = new ArrayList<>();
    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
      res.add(entry.getValue());
    }

    return res;
  }
}
