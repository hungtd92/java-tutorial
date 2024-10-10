package com.example.demo.array;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        arr1[0] = 0;
        arr1[1] = 1;
        arr1[2] = 2;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        String[] arr2 = new String[5];
        arr2[0] = "Mango";
        arr2[1] = "Banana";
        arr2[2] = "Orange";
        arr2[3] = "Apple";
        arr2[4] = "Lemon";
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        for (String e : arr2) {
            System.out.println(e);
        }

        int[] arr3 = new int[5];
        arr3[0] = 77;
        arr3[1] = 66;
        arr3[2] = 33;
        arr3[3] = 55;
        arr3[4] = 44;
        System.out.println("min arr3 " + min(arr3));
        System.out.println("min anonymous array " + min(new int[]{22, 33, 11, 44, 55, 66, 88}));

        System.out.println("-------------------------------------");

        //declaring a source array
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
        //declaring a destination array
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom, 1, copyTo, 0, 5);
        printArrayChar(copyTo);

        System.out.println("-------------------------------------");

        int[] arr4 = {33,3,4,5};
        printArrayInt(arr4);

        int[] arr5 = arr4.clone();
        printArrayInt(arr5);

        System.out.println("Are both equal?");
        System.out.println(arr4 == arr5);
    }

    static int min(int[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }

    static void printArrayInt(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");
    }

    static void printArrayChar(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");
    }
}
