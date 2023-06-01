package com.example.demo.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheatSheet {
  /**
   *  https://leetcode.com/problems/subsets/
   */
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrackS(list, new ArrayList<>(), nums, 0);
    return list;
  }

  private void backtrackS(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
    list.add(new ArrayList<>(tempList));
    for(int i = start; i < nums.length; i++){
      tempList.add(nums[i]);
      backtrackS(list, tempList, nums, i + 1);
      tempList.remove(tempList.size() - 1);
    }
  }


}
