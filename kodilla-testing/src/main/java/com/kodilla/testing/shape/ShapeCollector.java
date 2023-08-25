package com.kodilla.testing.shape;

import java.util.ArrayList;


public class ShapeCollector {
    private final ArrayList<Shape> shapes;

    public ShapeCollector() {
        shapes = new ArrayList<>();
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);

    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int index) {
        if (index >= 0 && index < shapes.size()) {
            return shapes.get(index);
        }
        return null;
    }

    public ArrayList<Shape> getAllShapes() {
        return shapes;
    }

    public void showFigures() {

    }
}

