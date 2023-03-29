package com.m2p;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleShapeTest {

    RectangleShape rectangleObject = new RectangleShape();

    @Nested
    class RectangleArea {
        @Test
        void toReturnAreaAsSixTeenWhenEightAndTwoAreSides() {
            //Arrange
            double expectedArea = 16;

            //Act
            double actualArea = rectangleObject.findRectangleArea(2, 8);

            //Assert
            assertEquals(expectedArea, actualArea);
        }

        @Test
        void toReturnExceptionWhenNegativeValueEntered()
        {
            assertThrows(IllegalArgumentException.class, ()-> rectangleObject.findRectangleArea(-3,4));
        }
    }


    @Nested
    class RectanglePerimeter{
        @Test
        void toReturnSixteenAsPerimeterWhenThreeAndFiveAreSides()
        {
            double expectedPerimeter = 16;

            double actualPerimeter = rectangleObject.findRectanglePerimeter(3,5);

            assertEquals(expectedPerimeter,actualPerimeter);
        }

        @Test
        void toReturnExceptionWhenNegativeValueEntered()
        {
            assertThrows(IllegalArgumentException.class, ()-> rectangleObject.findRectanglePerimeter(-3,4));
        }
    }

    @Nested
    class SquareArea{
        @Test
        void toReturnAreaAsSixteenWhenTheSideIsFour()
        {
            double expectedArea = 16;

            double actualArea = rectangleObject.findSquareArea(4);

            assertEquals(expectedArea,actualArea);
        }

        @Test
        void toReturnExceptionWhenNegativeValueEntered()
        {
            assertThrows(IllegalArgumentException.class, ()-> rectangleObject.findSquareArea(-4));
        }
    }

    @Nested
    class SquarePerimeter{
        @Test
        void toReturnPerimeterAsTwelveWhenTheSideIsThree()
        {
            double expectedArea = 12;

            double actualArea = rectangleObject.findSquarePerimeter(3);

            assertEquals(expectedArea,actualArea);
        }

        @Test
        void toReturnExceptionWhenNegativeValueEntered()
        {
            assertThrows(IllegalArgumentException.class, ()-> rectangleObject.findSquarePerimeter(-4));
        }
    }

}
