package com.pragra;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        int x = 3;
        System.out.println("enter a number");


        Scanner sc = new Scanner(System.in);
        int capturedInput = sc.nextInt();
        System.out.println(capturedInput);
    }
}
