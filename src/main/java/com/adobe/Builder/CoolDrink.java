package com.adobe.Builder;

public abstract  class CoolDrink implements  Item {
    @Override
    public abstract  String name() ;

    @Override
    public abstract float price() ;

    @Override
    public Packing packaging() {
        return new Bottle();
    }
}
class coke extends CoolDrink{

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 10.5f;
    }
}
class Pepsi extends CoolDrink{

    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 12.5f;
    }
}