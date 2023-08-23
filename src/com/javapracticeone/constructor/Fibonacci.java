package com.javapracticeone.constructor;

public class Fibonacci {
    public static void main(String[] args) {

        int f[]=new int[100];
        for(int j=0; j<100;j++){
            f[j]=j;

        }

        System.out.println(f[0]);
        System.out.println(f[1]);

        int i=2;
        while( f[i-1]<100){
            f[i]=f[i-1]+f[i-2];
            if(f[i]>100)
                break;
            System.out.println(f[i]);
            i++;

        }
        }
    }