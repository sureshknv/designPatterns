package com.adobe.Builder;

public interface Packing {
    public String  Pack();

}

class Wrapper implements  Packing{

    @Override
    public String  Pack() {
        return "Wrapper";
//        System.out.println("This item is wrapped");
    }
}
class Bottle implements  Packing{

    @Override
    public String  Pack() {
        return "Bottle";
//        System.out.println("this item is being bottled");
    }
}