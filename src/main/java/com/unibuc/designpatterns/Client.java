package com.unibuc.designpatterns;

import com.unibuc.designpatterns.structural.adapter.Rectangle;
import com.unibuc.designpatterns.structural.adapter.SquareToRectangleConverter;
import com.unibuc.designpatterns.structural.bridge.Blue;
import com.unibuc.designpatterns.structural.bridge.Red;
import com.unibuc.designpatterns.structural.bridge.Shape;
import com.unibuc.designpatterns.structural.bridge.Square;
import com.unibuc.designpatterns.structural.proxy.Internet;
import com.unibuc.designpatterns.structural.proxy.InternetImpl;
import com.unibuc.designpatterns.structural.proxy.ProxyImpl;

public class Client {
    public static void main(String[] args) {
        // adapter
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea(2, 3));

        SquareToRectangleConverter converter = new SquareToRectangleConverter(rectangle);
        System.out.println(converter.getArea(2));

        // bridge
        Shape shape = new com.unibuc.designpatterns.structural.bridge.Rectangle();
        System.out.println(shape.draw(new Red()));

        Shape square = new Square();
        System.out.println(square.draw(new Blue()));

        // proxy
        Internet internet = new InternetImpl();
        internet.connectTo("abc");

        Internet proxiedInternet = new ProxyImpl(new InternetImpl());
        proxiedInternet.connectTo("abc");
    }
}
