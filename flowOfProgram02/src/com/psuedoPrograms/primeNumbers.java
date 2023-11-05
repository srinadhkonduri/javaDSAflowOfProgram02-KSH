package com.psuedoPrograms;

import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==1){
            System.out.println("the number is a prime number");
        } else {
            System.out.println("the number is  ot a prime number");
        }
    }
}
