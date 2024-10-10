package com.example.demo;

import org.springframework.boot.SpringApplication;

import java.util.*;

public class TwoSum {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
    int[] arr = {2, 7, 11, 15};
    int[] rs = twoSum(arr, 9);
    System.out.println(Arrays.toString(rs));
  }

  public static int[] twoSum(int[] nums, int target) {
//    Set<Integer> s = new HashSet<>();
//
//    for (int i = 0; i < nums.length; i++) {
//      int tmp = target - nums[i];
//      if (s.contains(tmp) && tmp > 0) {
//        int[] arr = new int[2];
//        arr[0] =
//      }
//      s.add(nums[i]);
//    }
//
//    int[] arr = new int[s.size()];
//    int i = 0;
//    for (int x : s)
//      arr[i++] = x;
//
//    return arr;

//    int l = 0;
//    int r = nums.length - 1;
//    int[] arr = new int[2];
//    while (l < r) {
//      if (nums[l] + nums[r] == target) {
//        arr[0] = l;
//        arr[1] = r;
//        break;
//      } else if (nums[l] + nums[r] > target) {
//        r--;
//      } else {
//        l++;
//      }
//    }
//
//    return arr;

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int tmp = target - nums[i];
      if (map.containsKey(tmp)) {
        return new int[] {map.get(tmp), i};
      }
      map.put(nums[i], i);
    }

    throw new IllegalArgumentException("No two num");
  }

}
