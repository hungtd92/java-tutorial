package com.example.demo.test;

import java.util.List;

public class StoneGameWinner {

//    Question: Piles Game
//
//    Sam and Alex are playing a new game where there are a number of piles, each with any number of stones in it.
//    Players take turns removing stones from any one pile.
//    The number removed has to be either:
//        1. an integer multiple of a given number, k, where k > 0.
//        2. if there are fewer than k stones in a pile, any number can be removed.
//
//    Determine who wins the game. Sam always starts, they both play optimally, and the last player to remove a stone wins. If Sam wins, return "Sam wins the game of n pile(s)", where n is the number of piles in the input. If Alex wins, return "Alex wins the game of n pile(s).".
//    For example, a game starts with n = 3 piles of stones that
//    contain piles - [3, 5, 7] stones, and a constant k = 2. Sam
//    will go first and remove 1 k = 1  2 stones from the
//    third pile leaving 7 - 2 = 5 stones in that pile.


    public static String gameOfPiles(List<Integer> piles, int k) {
        int n = piles.size();

        // Create a 2D DP array
        int[][] dp = new int[n][n];

        // Fill the DP array diagonally
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;

                // Base case: When there is only one pile
                if (i == j) {
                    dp[i][j] = piles.get(i);
                    System.out.println(String.format("dp[%d][%d] - piles.get(i): %d", i, j, piles.get(i)));
                } else {
                    int maxPick = Math.min(j - i + 1, k);
                    int remainingStones = piles.get(i);

                    // Calculate the maximum stones Sam can win
                    for (int pick = 1; pick <= maxPick; pick++) {
                        remainingStones = Math.max(remainingStones, piles.get(i + (pick - 1)) - dp[i + (pick - 1)][j]);
                    }
                    dp[i][j] = remainingStones;
                    System.out.println(String.format("dp[%d][%d] - remainingStones: %d", i, j, remainingStones));
                }
            }
        }

        // Sam wins if the total stones Sam wins is greater than half of the total stones
        if (dp[0][n - 1] > piles.stream().mapToInt(Integer::intValue).sum() / 2) {
            return "Sam wins the game of " + n + " pile(s).";
        } else {
            return "Alex wins the game of " + n + " pile(s).";
        }
    }

    public static void main(String[] args) {
        // Example 1
        List<Integer> piles1 = List.of(3, 5, 7);
        int k1 = 2;
        String winner1 = gameOfPiles(piles1, k1);
        System.out.println("Example 1 - " + winner1);  // Output: Sam wins the game of 3 pile(s).

        System.out.println("---------------------------------------------------------------");

        // Example 2
        List<Integer> piles2 = List.of(1, 2, 3);
        int k2 = 1;
        String winner2 = gameOfPiles(piles2, k2);
        System.out.println("Example 2 - " + winner2);  // Output: Alex wins the game of 3 pile(s).
    }

}

