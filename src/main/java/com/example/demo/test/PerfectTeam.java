package com.example.demo.test;

import java.util.HashMap;
import java.util.Map;

public class PerfectTeam {

//  Question: The Perfect Team
//
//  The School of Languages and Science teaches five subjects: Physics, Chemistry, Math, Botany, and Zoology.
//  Each student is skilled in one subject.
//  The skills of the students are described by string of named skills that consists of the letters p, c, m, b, and z only.
//  Each character describes the skill of a student.
//
//  Given a list of students skills, determine the total number of different teams satisfying the following constraints:
//      • A team consists of a group of exactly five students.
//      • Each student is skilled in a different subject.
//      • A student may only be on one team.
//
//  - Example 1
//  skills = pcmbzpcmbz
//  There are 2 possible teams that can be formed at one
//  time: skills[0-4] = pcmbz and skills[5-9] = pcmbz, for
//  example.
//  - Example 2
//  skills = mppzbmbpzcbmpbmczcz
//  The sorted string is bbbbcccmmmmppppzzzz. All of the skills are represented,
//  but there are only 3 students skilled in Chemistry. Only 3 teams can be created.

  public static int perfectTeam(String skills) {
    // Count the occurrences of each skill
    Map<Character, Integer> skillCounts = new HashMap<>();
    for (char skill : skills.toCharArray()) {
      System.out.println("skill: " + skill + " skillCounts.get: " + (skillCounts.getOrDefault(skill, 0) + 1));
      skillCounts.put(skill, skillCounts.getOrDefault(skill, 0) + 1);
    }
    System.out.println("skillCounts: " + skillCounts);
    // find the minumum among all skills
    int minCount = Integer.MAX_VALUE;
    for (int count : skillCounts.values()) {
      minCount = Math.min(minCount, count);
    }

    return minCount;
  }

  public static void main(String[] args) {
    // Example usage
    String skills1 = "pcmbzpcmbz";
    int perfectTeams1 = perfectTeam(skills1);
    System.out.println("Perfect teams in " + skills1 + ": " + perfectTeams1); // Output: 2

    String skills2 = "mppzomopzcompbmczcz";
    int perfectTeams2 = perfectTeam(skills2);
    System.out.println("Perfect teams in " + skills2 + ": " + perfectTeams2); // Output: 1

    String skills3 = "mppzbmbpzcbmpbmczcz";
    int perfectTeams3 = perfectTeam(skills3);
    System.out.println("Perfect teams in " + skills3 + ": " + perfectTeams3); // Output: 3
  }
}
