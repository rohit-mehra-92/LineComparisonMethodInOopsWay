package com.bridgelabz.linecomparison;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point();
        p1.x = 5;
        p1.y = 6;

        Point p2 = new Point();
        p2.x = 3;
        p2.y = 8;

        Line l1 = new Line();
        l1.p1 = p1;
        l1.p2 = p2;
        l1.length = l1.getLenght();

        System.out.println(l1.length);

        Point p3 = new Point();
        p3.x = 7;
        p3.y = 9;

        Point p4 = new Point();
        p4.x = 9;
        p4.y = 5;

        Line l2 = new Line();
        l2.p1 = p3;
        l2.p2 = p4;
        l2.length = l2.getLenght();

        System.out.println("length of line2: " + l2.length);

        System.out.println(l1.equals(l2));

    }
}
