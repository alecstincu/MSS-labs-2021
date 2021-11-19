package com.unibuc.designpatterns.structural.adapter;

public class SquareToRectangleConverter implements Square {

    private final Rectangle rectangle;

    public SquareToRectangleConverter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public int getArea(int length) {
        return rectangle.getArea(length, length);
    }
}
