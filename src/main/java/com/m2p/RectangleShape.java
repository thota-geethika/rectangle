package com.m2p;

public class RectangleShape {


    public double findArea(double length, double breadth) {

        if(length < 0 || breadth <0)
        {
            throw new IllegalArgumentException();
        }
        return length*breadth;
    }
}
