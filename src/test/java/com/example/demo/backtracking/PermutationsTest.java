package com.example.demo.backtracking;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class PermutationsTest {

  Permutations permutations = new Permutations();
  @Test
  void permute_NoNums() {
    int[] arr = new int[]{};
    List<List<Integer>> permutations = this.permutations.permute(arr);
    System.out.println(permutations);
  }
  @Test
  void permute_3Nums() {
    int[] arr = new int[]{1,2,3};
    List<List<Integer>> permutations = this.permutations.permute(arr);
    System.out.println(permutations);
  }
  @Test
  void permuteBackTrack_3Nums() {
    int[] arr = new int[]{1,2,3};
    List<List<Integer>> permutations = this.permutations.permuteWithBackTracking(arr);
    System.out.println(permutations);
  }

  @Test
  void permute_2Nums() {
    int[] arr = new int[]{1,2};
    List<List<Integer>> permutations = this.permutations.permute(arr);
    System.out.println(permutations);
  }
  @Test
  void permute_5Nums() {
    int[] arr = new int[]{1,2,3,4,5};
    List<List<Integer>> permutations = this.permutations.permute(arr);
    System.out.println(permutations);
  }
}