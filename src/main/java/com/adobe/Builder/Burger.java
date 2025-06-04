package com.adobe.Builder;



public abstract class Burger implements Item {
//    private String name;
//    private float price;
//    private String package;

    @Override
    public Packing packaging(){
        System.out.println("Since it is a burger it will be wrapped");
        return new Wrapper();
    }
    @Override
    public abstract float price();
    @Override
    public  abstract String name();
}

class VegBurger extends Burger{

    @Override
    public float price() {
        return 25.5f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
class ChickenBurger extends Burger{

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
