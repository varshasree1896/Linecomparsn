package com.blz.linecomparsn;

import java.util.Objects;

public class Linecomparsn {

    public static void main(String[] args) {
    //Declaring and Initializing the variables
         double x1 = 2;
         double x2 = 4;
         double y1 = 6;
         double y2 = 12;
         double x3 = 2;
         double x4 = 4;
         double y3 = 6;
         double y4 = 10;

        //Use Math function to calculate length of line
        String lengthOfLine1 = String.valueOf(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        String lengthOfLine2 = String.valueOf(Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2)));
        System.out.println("Length Of Line1 = " + lengthOfLine1);
        System.out.println("Length Of Line2 = " + lengthOfLine2);

        //Use Equals method to check equality of two lines
        if ( lengthOfLine1.equals(lengthOfLine2) ) {
            System.out.println("Length of two lines are equal");
        } else {
            System.out.println("Length of two lines are different");
        }

        //Using compareTo method compare two lines
        double diff = (lengthOfLine1.compareTo(lengthOfLine2));
        System.out.println("Differance between two lines = " + diff);

    }
}
