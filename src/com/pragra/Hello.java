package com.pragra;


import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {


//        String s = "Mohit";        //--------------------------A = 77 a =99
//
//        byte[] bytes = s.getBytes();
//
//        System.out.println(Arrays.toString(bytes));;;   // convert string into bytes  !!!!!


        String s = "Mohit";

        String m = "Mushinder";


        int d = s.compareTo(m);

        if (d < 1) {

            System.out.println(s + "," + m);
        } else
            System.out.println(m + "," + s);
    }



}