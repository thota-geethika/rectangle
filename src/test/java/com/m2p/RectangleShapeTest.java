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
            double actualArea = rectangleObject.findArea(2, 8);

            //Assert
            assertEquals(expectedArea, actualArea);
        }

        @Test
        void toReturnExceptionWhenNegativeValueEntered()
        {
            assertThrows(IllegalArgumentException.class, ()-> rectangleObject.findArea(-3,4));
        }
    }


    @Nested
    class RectanglePerimeter{
        @Test
        void toReturnSixteenAsPerimeterWhenThreeAndFiveAreSides()
        {
            double expectedPerimeter = 16;

            double actualPerimeter = rectangleObject.findPerimeter(3,5);

            assertEquals(expectedPerimeter,actualPerimeter);
        }

        @Test
        void toReturnExceptionWhenNegativeValueEntered()
        {
            assertThrows(IllegalArgumentException.class, ()-> rectangleObject.findPerimeter(-3,4));
        }
    }

}
