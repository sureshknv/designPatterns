package com.adobe.Factory;

public class StaticShapeFactory {

    public static Shape getShape(String str){
        if(str.equals("Rectangle")){
            return new Rectangle(4,5);
        }else if (str.equals("circle")){
            return  new Circle(5);
        }else{
            return null;
        }
    }
}
