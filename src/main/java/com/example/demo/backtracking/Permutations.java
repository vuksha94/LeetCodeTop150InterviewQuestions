package com.example.demo.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Permutations {
  public List<List<Integer>> permute(int[] nums) {

    if (nums.length == 0) {
      return Collections.emptyList();
    }

    List<List<Integer>> result = new LinkedList<>();
    for (int i = 0; i < nums.length; i++) {
      makePermutations(nums, i, result);
    }

    return result;
  }

  private void makePermutations(int[] nums, int idx, List<List<Integer>> result) {
    int numToInsert = nums[idx];
    if (result.isEmpty()) {
      List<Integer> list = new LinkedList<>();
      list.add(numToInsert);
      result.add(list);
      return;
    }
    int length = result.size();
    for (int i = 0; i < length; i++) {
      List<Integer> remove = result.remove(0);
      for (int j = 0; j <= remove.size(); j++) {
        List<Integer> toAdd = copyList(remove); // deep copy ???

        toAdd.add(j, numToInsert);
        result.add(toAdd);
      }
    }

  }

  private LinkedList<Integer> copyList(List<Integer> src) {
    LinkedList<Integer> res = new LinkedList<>();
    for (int i = 0; i < src.size(); i++) {
      res.add(Integer.valueOf(src.get(i)));
    }

    return res;
  }

  /**
   * Approach 2: Backtracking
   * Permutations : https://leetcode.com/problems/permutations/
   */
  public List<List<Integer>> permuteWithBackTracking(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    // Arrays.sort(nums); // not necessary
    permuteWithBackTracking(list, new ArrayList<>(), nums);
    return list;
  }
  private void permuteWithBackTracking(List<List<Integer>> list, List<Integer> tempList, int [] nums) {
    if (tempList.size() == nums.length) {
      list.add(new ArrayList<>(tempList));
    }
    else {
      for (int i = 0; i < nums.length; i++) {
        if (tempList.contains(nums[i]))
          continue; // element already exists, skip
        tempList.add(nums[i]);
        permuteWithBackTracking(list, tempList, nums);
        tempList.remove(tempList.size() - 1);
      }
    }
  }


}
