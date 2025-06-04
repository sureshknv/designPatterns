package com.adobe.Protype;

import java.util.Hashtable;

public class ShapeCache {
    //id,shape stored as cache
    private static Hashtable<String,Shape>shapeCache= new Hashtable<>();

    public static Shape getShape(String type){
        Shape cacheShape= shapeCache.get(type);
        try {
            return (Shape) cacheShape.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

        public static  void  loadCache(){
            Square s= new Square();
            s.setId("1");
            s.setType("square");
            s.setValue("This is dummy value");
            shapeCache.put("1",s);

            Rectangle r= new Rectangle();
            r.setId("2");
            r.setType("rectangle");
            r.setValue("This is dummy value");
            shapeCache.put("2",r);
        }

}
