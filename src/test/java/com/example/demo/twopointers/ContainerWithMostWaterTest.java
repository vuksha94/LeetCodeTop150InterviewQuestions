package com.example.demo.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

  private static ContainerWithMostWater testingClass;

  @BeforeAll
  static void beforeAll() {
    testingClass = new ContainerWithMostWater();
  }
  @Test
  void maxArea() {
    int[] nums = new int[]{1,8,6,2,5,4,8,3,7};
    Assertions.assertEquals(49, testingClass.maxArea(nums));
  }
}