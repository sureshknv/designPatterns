package com.adobe.Factory;

public class RectangleFactory extends AbstractShapeFactory {

    protected Shape factoryMethod() {
        return new Rectangle(2, 3);
    }

}
