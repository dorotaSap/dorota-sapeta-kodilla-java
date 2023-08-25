package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;



public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Test for adding and removing shapes")
    class AddRemoveTests{


        @Test
        @DisplayName("Adding a shape should increase the size of the collection")
        void testAddShape(){
//            Given
            ShapeCollector collector = new ShapeCollector();
//            When
            collector.addFigure(new Square(2.0));
            collector.addFigure(new Circle(5.0));
            collector.addFigure(new Triangle(4.0, 6.0));
//            Then
            Assertions.assertEquals(3, collector.getAllShapes().size());

        }

        @Test
        @DisplayName("Removing a shape should decrease the size of the collection")
        void testRemoveShape(){
//            Given
            ShapeCollector collector = new ShapeCollector();
//            Then
            Square square = new Square(2.0);
            Circle circle = new Circle(5.0);

            collector.addFigure(square);
            collector.addFigure(circle);

            collector.removeFigure(square);
//            When
            Assertions.assertEquals(1, collector.getAllShapes().size());

        }
    }

    @Nested
    @DisplayName("Tests for getting shapes")
    class GetShapeTest{

        @Test
        @DisplayName("Getting a shape at a valid index should return the correct shape")
        void testValidIndex(){
//            Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Square(2.0));
            collector.addFigure(new Circle(5.0));
//            When
            Shape shape = collector.getFigure(1);
//            Then
            Assertions.assertEquals("Circle", shape.getShapeName());

        }

        @Test
        @DisplayName("Getting a shape at an invalid index should return null")
        void testInvalidIndex(){
//            Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Square(2.0));
            collector.addFigure(new Circle(5.0));
//            When
            Shape shape = collector.getFigure(6);
//            Then
            Assertions.assertTrue(shape == null);

        }
    }
}
