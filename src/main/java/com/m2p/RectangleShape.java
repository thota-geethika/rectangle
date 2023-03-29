package com.m2p;

public class RectangleShape {


    public double findRectangleArea(double length, double breadth) {

        if(length < 0 || breadth <0)
        {
            throw new IllegalArgumentException();
        }
        return length*breadth;
    }

    public double findRectanglePerimeter(double length, double breadth) {

        if(length < 0 || breadth <0)
        {
            throw new IllegalArgumentException();
        }
        return 2 * (length + breadth);
    }

    public double findSquareArea(double side) {

        return findRectangleArea(side,side);
    }


    public double findSquarePerimeter(double side) {

        return findRectanglePerimeter(side,side);
    }
}
