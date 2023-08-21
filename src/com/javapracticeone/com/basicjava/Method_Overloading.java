package com.javapracticeone.com.basicjava;

public class Method_Overloading {
    public static void main(String[] args) {

        Method_Overloading m = new Method_Overloading();

        /**
         * Method Overloading
         * Data Type
         * Number of Args
         * Order
         *
         */

        m.addition(10,20);
        m.addition(10.1, 10.2);
    }
        public void addition ( int num1, int num2){
            System.out.println(num1 + num2);
        }

        public void addition ( double num1, double num2){
            System.out.println(num1 + num2);
        }

        public void addition ( int num1, double num2){
            System.out.println(num1 + num2);
        }

        public void addition ( double num1, int num2){
            System.out.println(num1 + num2);
        }

        public void addition ( int num1, int num2, int num3){
            System.out.println(num1 + num2 + num3);
        }

    }
