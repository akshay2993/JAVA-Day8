package com.bridgelabz.Java_Day8;

import java.util.Scanner;

public class LineComparison {
    static int x1, y1, x2, y2;
    static int x3, y3, x4, y4;
    public Double getLength(int x1, int y1, int x2, int y2) {
        Double length = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
        Double dist = Math.sqrt(length);
        return dist;
    }

    public void equals(Double l1, Double l2) {
        System.out.println("Java equals method: ");
        if(l1.equals(l2)){
            System.out.println("Line 1 is equal to Line 2!");
        }else {
            System.out.println("Line 1 is not equal to line 2!");
        }
    }

    public void compareTo(Double l1, Double l2) {
        System.out.println("Java compareTo method: ");
        if(l1.compareTo(l2) > 0){
            System.out.println("Line 1 is greater than Line 2!");
        }else if(l1.compareTo(l2) < 0){
            System.out.println("Line 2 is greater than Line 1!");
        }else {
            System.out.println("Line 1 is equal to Line 2!");
        }
    }

    public static void main(String[] args) {
        LineComparison lineComparison = new LineComparison();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of two points(Line: 1)- x1, y1, x2, y2: ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println("(x1, y1) - "+ "(" + x1 +", "+ y1  +")\n" + "(x2, y2) - "+ "(" + x2 +", "+ y2  +")");

        System.out.println("Enter coordinates of two points(Line: 2)- x3, y3, x4, y4: ");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        x4 = sc.nextInt();
        y4 = sc.nextInt();
        System.out.println("(x3, y3) - "+ "(" + x3 +", "+ y3  +")\n" + "(x4, y4) - "+ "(" + x4 +", "+ y4  +")");

        Double line1Length = lineComparison.getLength(x1, y1, x2, y2);
        System.out.println("Line 1 length: "+line1Length);
        Double line2Length = lineComparison.getLength(x3, y3, x4, y4);
        System.out.println("Line 2 length: "+line2Length);

        lineComparison.equals(line1Length, line2Length);

        lineComparison.compareTo(line1Length, line2Length);
    }
}
