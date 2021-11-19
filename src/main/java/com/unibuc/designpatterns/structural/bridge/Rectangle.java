package com.unibuc.designpatterns.structural.bridge;

public class Rectangle implements Shape {

    @Override
    public String draw(Color color) {
        return "Drew a rectangle of color " + color.fill();
    }
}
