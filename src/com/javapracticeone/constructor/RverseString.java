package com.javapracticeone.constructor;

public class RverseString {
    public static void main(String[] args) {


                //Program to reverse a string

                String str1 = "ABCDE";
                String temp = "";

                for (int i = 0; i <= str1.length()-1; i++) {
                    temp = str1.charAt(i) + temp;
                }

                System.out.println("Reversed String: " + temp);
            }
    }

