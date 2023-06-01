package com.example.demo.arraystring;

public class RemoveDuplicatesFromSortedArray {
  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;

    int curr = nums[0];
    int idx = 1;

    for(int i = 1; i < nums.length; i++) {
      if (nums[i] > curr) {
        curr = nums[i];
        nums[idx++] = nums[i];
      }
    }

    return idx;
  }
}
