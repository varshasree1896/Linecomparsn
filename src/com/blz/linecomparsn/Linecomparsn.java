package com.blz.linecomparsn;

import java.util.Scanner;

public class Linecomparsn {
    public static void main(String[] args) {
        double x1, x2, y1, y2;
        double distance1;
        Scanner scan= new Scanner(System.in);
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        System.out.println("enter x1 coordinates");
        x1 = scan.nextInt();
        System.out.println("enter y1 coordinates");
        y1 = scan.nextInt();
        System.out.println("enter x2 coordinates");
        x2 = scan.nextInt();
        System.out.println("enter y2 coordinates");
        x2 = scan.nextInt();
        System.out.println();
        distance1 = Math.sqrt(Math.pow(x1 - x2, 2) + (Math.pow(y1 - y2, 2)));
        System.out.println("The distance" + distance1);

    }
}
