package com.patterns;

import java.util.Scanner;

public class decreasingTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
//            for decreasing triangle change first condition to j=i
            for (int j = i; j <n ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
