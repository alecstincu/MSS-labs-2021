package com.unibuc.designpatterns.structural.bridge;

public class Square implements Shape {

    @Override
    public String draw(Color color) {
        return "Drew a square of color " + color.fill();
    }
}
