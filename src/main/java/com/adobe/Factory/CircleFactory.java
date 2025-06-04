package com.adobe.Factory;

public class CircleFactory extends AbstractShapeFactory {

    protected Shape factoryMethod() {
        return new Circle(4);
    }

}
