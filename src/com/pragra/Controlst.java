package com.pragra;

import javax.swing.*;

public class Controlst {
    public static void main(String[] args) {
        testEvenOrOdd(327);

        testPositiveNegative(0);
    }

    public static void testEvenOrOdd (int x){
        if(x%2==0){
            System.out.println("Even");
        }
        else {
                System.out.println("odd");
            }
    }
      public static void testPositiveNegative(int x){
        if (x>0) {
              System.out.println("poitive");
          }
          else if (x<0){
              System.out.println("negative");
          }
          else {
            System.out.println("zero");
        }
      }

}

