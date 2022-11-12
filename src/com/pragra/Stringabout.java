package com.pragra;

import java.util.Arrays;

public class Stringabout {

    public static void main(String[] args) {

        String s = "Mohit taya ror";

        String g = "Simran";

        System.out.println(s.startsWith("Mo"));        //   string start with or end with suffix or prefix


        char[] chars = g.toCharArray();


        System.out.println(chars);




        String[] s1 = s.split(" ");   // split on basis of whatever in ""

        System.out.println(s); // is also same doing arrays.toString at the back in the method

//        System.out.println(s1);   without arrays.string will output wierd codes

       System.out.println(Arrays.toString(s1));


       String k =  "     Pushpinder   ";

        System.out.println(k.trim());             //   trim space from front and end of the string

        String s2 = k.replace("P", "K");   // Replace existing data with a new one


        System.out.println(s2.trim());


//


    }
}
