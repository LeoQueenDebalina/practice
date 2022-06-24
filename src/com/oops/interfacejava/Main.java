package com.oops.interfacejava;
interface Polygon {
    void getArea(int length, int breadth);
}


class Triangle implements Polygon {


    public void getArea(int length, int breadth) {
        System.out.println("The area of the triangle is " + (length * breadth)/2);
    }
}

class Main {
    public static void main(String[] args) {
        Triangle r1 = new Triangle();
        r1.getArea(5, 6);
    }
}

