package com.javapracticeone.Array;

public class ArrayPractice {
    public static void main(String[] args) {
        System.out.println("JD is learning Array");

        String [] DaysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        String [] MonthsOfYear = {"Jan", "Feb","March"};
        System.out.println(DaysOfWeek.length);
        System.out.println(MonthsOfYear.length);
        System.out.println(MonthsOfYear[1]);

        System.out.println(DaysOfWeek[2]);

        DaysOfWeek[2] = "RRR";

        System.out.println(DaysOfWeek[2]);
        System.out.println("--------------------------------");
        MonthsOfYear[1]= "February";
        System.out.println(MonthsOfYear[1]);

        for (int i = 0; i <= DaysOfWeek.length - 1; i++) {
            System.out.println(DaysOfWeek[i]);
        }
        System.out.println("--------------------------------");
        for(int i =0; i<= MonthsOfYear.length-1; i++){
            System.out.println(MonthsOfYear[i]);
        }

        int [] arr1 = {12,3,34,65,765,678,87654,456};

        char [] arr2 = {'a','e','i'};



    }
}
