package com.m2p;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleShapeTest {

    RectangleShape rectangleObject = new RectangleShape();

    @Nested
    class Area {
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
}
