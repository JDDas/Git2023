package com.javapracticeone.Array;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr1 = {10,20,30,40,50,60};
        int j = arr1.length-1;
        int temp = 0;
        for(int i=0; i<= (arr1.length-1)/2; i++) {
            temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
            j--;
        }
        for (int x : arr1) {
            System.out.println(x);
        }

        }


    }

