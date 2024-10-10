package com.example.demo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReassignedPriorities {

//  A system used by a compliance department contains a queue of all current compliance issues along with their priorities.
//  The priorities range from 1 to 99. Create an algorithm that will reassign priorities
//  so that the value of the maximum priority assigned is minimized, keeping the relative priorities between all issues the same.
//  Example
//  priorities = [1, 4, 8, 4]
//  There are three priority levels: 1, 4 and 8. The array elements are reassigned to priorities [1, 2, 3, 2].
//  Their relative priorities are maintained while the value of the maximum priority is minimized.
//  Given the priorities of the issues, return a list that contains the reassigned priority values without reordering.
  public static List<Integer> reassignPriorities(List<Integer> priorities) {
    // Map original priorities to their corresponding reassigned priorities
    List<Integer> listWithoutDuplicates = priorities.stream().distinct().sorted().collect(Collectors.toList());

    Map<Integer, Integer> priorityMap = new HashMap<>();
    int i = 1;
    while (i <= listWithoutDuplicates.size()) {
      priorityMap.put(listWithoutDuplicates.get(i - 1), i);
      i++;
    }

    System.out.println("priorityMap: " + priorityMap);

    // Find the maximum priority in the original list
    int maxPriority = priorities.stream().mapToInt(Integer::intValue).max().orElse(0);
    System.out.println("maxPriority: " + maxPriority);

    // Calculate the corresponding reassigned priority for the maximum priority
    int reassignedMaxPriority = priorityMap.get(maxPriority);
    System.out.println("reassignedMaxPriority: " + reassignedMaxPriority);

    // Create the list of reassigned priorities
    List<Integer> reassignedPriorities = new ArrayList<>();
    for (int priority : priorities) {
      System.out.println("priorityMap.get(priority): " + priority + " " + priorityMap.get(priority));
      reassignedPriorities.add(priorityMap.get(priority));
    }
    System.out.println("reassignedPriorities: " + reassignedPriorities);

    // Replace the reassigned maximum priority
//    int maxIndex = priorities.indexOf(maxPriority);
//    System.out.println("maxIndex: " + maxIndex);
//    reassignedPriorities.set(maxIndex, reassignedMaxPriority);
//
//    System.out.println("reassignedPriorities: " + reassignedPriorities);
    return reassignedPriorities;
  }

  public static void main(String[] args) {
    // Example usage
    List<Integer> priorities1 = new ArrayList<>();
    priorities1.add(1);
    priorities1.add(4);
    priorities1.add(8);
    priorities1.add(4);

    List<Integer> reassigned1 = reassignPriorities(priorities1);

    // Print reassigned priorities
    System.out.println("Reassigned Priorities Input: " + priorities1);
    System.out.println("Reassigned Priorities Output: " + reassigned1);

    System.out.println("=========================================================================");

    List<Integer> priorities2 = new ArrayList<>();
    priorities2.add(3);
    priorities2.add(5);
    priorities2.add(7);
    List<Integer> reassigned2 = reassignPriorities(priorities2);
    // Print reassigned priorities
    System.out.println("Reassigned Priorities Input: " + priorities2);
    System.out.println("Reassigned Priorities Output: " + reassigned2);

  }
}
