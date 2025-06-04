package com.adobe.AbstractFactory;


public abstract class AbstractFactory {
    public abstract  Color getColor(String type);
    public abstract Shape getShape(String type);
}

class ShapeFactory extends AbstractFactory{


    @Override
    public Color getColor(String type) {
        return null;
    }

    @Override
    public Shape getShape(String type) {


            if(type.equalsIgnoreCase("Rectangle")){
                return new Rectangle();
            }else if (type.equalsIgnoreCase("circle")){
                return  new Circle();
            }else{
                return null;
            }

    }
}
class ColorFactory extends AbstractFactory{

    @Override
    public Color getColor(String type) {
        if(type.equalsIgnoreCase("Red")){
            return new Red();
        }else if (type.equalsIgnoreCase("green")){
            return  new Green();
        }else{
            return null;
        }
    }

    @Override
    public Shape getShape(String type) {
        return null;
    }
}
