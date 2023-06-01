package com.example.demo.twopointers;

public class ContainerWithMostWater {

  public int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;

    int maxA = 0;

    while (left < right) {
      int w = right - left;
      int h = Math.min(height[left], height[right]);
      int a = h * w;

      maxA = Math.max(maxA, a);
      if (height[left] < height[right]) {
        left++;
      }
      else {
        right--;
      }

    }

    return maxA;
  }
}
