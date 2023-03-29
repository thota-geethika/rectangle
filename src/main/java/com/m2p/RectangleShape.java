package com.m2p;

public class RectangleShape {


    private final double lengthOfRectangle;
    private final double breadthOfRectangle;
    RectangleShape(double lengthOfRectangle, double breadthOfRectangle)
    {
        this.lengthOfRectangle = lengthOfRectangle;
        this.breadthOfRectangle = breadthOfRectangle;
    }

    public static RectangleShape createSquare(double sideOfSquare)
    {
        return new RectangleShape(sideOfSquare,sideOfSquare);
    }

    public double findArea() {

        if(lengthOfRectangle < 0 || breadthOfRectangle <0)
        {
            throw new IllegalArgumentException();
        }
        return lengthOfRectangle*breadthOfRectangle;
    }

    public double findPerimeter() {

        if(lengthOfRectangle < 0 || breadthOfRectangle <0)
        {
            throw new IllegalArgumentException();
        }
        return 2 * (lengthOfRectangle + breadthOfRectangle);
    }



}
