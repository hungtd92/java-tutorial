package com.example.demo.array;

public class MultidimensionalArrayExample {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("");
        }

        System.out.println("-------------------------------------");

        int[][] arr2 = {{3,4,5}, {4,5,6},{7,8,9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + "  ");
            }
            System.out.println("");
        }

        System.out.println("-------------------------------------");

        int[][] arr3 = new int[4][];
        arr3[0] = new int[3];
        arr3[1] = new int[4];
        arr3[2] = new int[9];
        arr3[3] = new int[6];

        // Initializing a jagged array
        int count = 10;
        for (int i = 0; i < arr3.length; i++)
            for (int j = 0; j < arr3[i].length; j++)
                arr3[i][j] = count++;

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + "  ");
            }
            System.out.println(" ");
        }

        System.out.println("-------------------------------------");

        //creating two matrices
        int a[][] = {{1,3,4},{3,4,5}};
        printArray(a);
        int b[][] = {{4,2,7},{8,2,4}};
        printArray(b);

        int c[][] = new int[2][3];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        printArray(c);

    }

    static void printArray(int arr3[][]) {
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
