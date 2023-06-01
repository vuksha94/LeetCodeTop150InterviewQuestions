package com.example.demo.arraystring;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayTest {

  private static RemoveDuplicatesFromSortedArray testingClass;
  @BeforeEach
  void setUp() {
    testingClass = new RemoveDuplicatesFromSortedArray();
  }

  @Test
  void removeDuplicates() {
    int[] nums = new int[]{0,0,0,1,2,2};
    int res = testingClass.removeDuplicates(nums);

    Assertions.assertEquals(3, res);
  }


}