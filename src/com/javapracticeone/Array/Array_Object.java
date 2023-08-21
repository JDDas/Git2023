package com.javapracticeone.Array;

import java.util.Scanner;

public class Array_Object {
    public static void main(String[] args) {

       // int[] arr1 = new int[10];

       /* arr1[0] = 20;
        arr1[1] = 40;
        arr1[3] = 60;
        arr1[2] = 80;
        arr1[6] = 100;

        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.println(arr1[i]);
*/
            String[] arr2 = new String[4];
            arr2[0] = "Dark";
            arr2[1] = "Side";
            arr2[2] = "Of";
            arr2[3] = "Moon";

        //for (int i = 0; i <= arr2.length - 1; i++) {
            //System.out.println(arr2[i]);


           // System.out.println("--------------------------------");

            for(String x: arr2){
            System.out.println(x);
                System.out.println("--------------------------------");
                Scanner s1 = new Scanner(System.in);

                System.out.println("Please enter a number:");

                int num1 = s1.nextInt();

                int [] arr = new int [10];

                for (int i = 1; i <= 10; i++) {
                    arr[i-1] = num1 * i;
                }

                System.out.println("-------------------");

                for(int n : arr) {
                    System.out.println(n);
                }


            }

    }
}