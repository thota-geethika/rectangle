package com.m2p;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.m2p.RectangleShape.createSquare;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleShapeTest {

    @Nested
    class RectangleArea {
        @Test
        void toReturnAreaAsSixTeenWhenEightAndTwoAreSides() {
            //Arrange
            RectangleShape rectangleObject = new RectangleShape(2,8);
            double expectedArea = 16;

            //Act
            double actualArea = rectangleObject.findArea();

            //Assert
            assertEquals(expectedArea, actualArea);
        }

        @Test
        void toReturnExceptionWhenNegativeValueEntered()
        {
            RectangleShape rectangleObject = new RectangleShape(-3,4);
            assertThrows(IllegalArgumentException.class, rectangleObject::findArea);
        }
    }


    @Nested
    class RectanglePerimeter{
        @Test
        void toReturnSixteenAsPerimeterWhenThreeAndFiveAreSides()
        {
            RectangleShape rectangleObject = new RectangleShape(3,5);
            double expectedPerimeter = 16;

            double actualPerimeter = rectangleObject.findPerimeter();

            assertEquals(expectedPerimeter,actualPerimeter);
        }

        @Test
        void toReturnExceptionWhenNegativeValueEntered()
        {
            RectangleShape rectangleObject = new RectangleShape(-3,4);
            assertThrows(IllegalArgumentException.class, rectangleObject::findPerimeter);
        }
    }

    @Nested
    class SquareArea{
        @Test
        void toReturnAreaAsSixteenWhenTheSideIsFour()
        {
            RectangleShape square = createSquare(4);
            double expectedArea = 16;

            double actualArea = square.findArea();

            assertEquals(expectedArea,actualArea);
        }

        @Test
        void toReturnExceptionWhenNegativeValueEntered()
        {
            RectangleShape square = createSquare(-4);
            assertThrows(IllegalArgumentException.class, square::findArea);
        }
    }

    @Nested
    class SquarePerimeter{
        @Test
        void toReturnPerimeterAsTwelveWhenTheSideIsThree()
        {
            RectangleShape square = createSquare(3);
            double expectedArea = 12;

            double actualArea = square.findPerimeter();

            assertEquals(expectedArea,actualArea);
        }

        @Test
        void toReturnExceptionWhenNegativeValueEntered()
        {
            RectangleShape square = createSquare(-4);
            assertThrows(IllegalArgumentException.class, square::findPerimeter);
        }
    }

}
