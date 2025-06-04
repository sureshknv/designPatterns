package com.adobe.AdapterPattern;

public interface Turkey {
    public void gobble();
    public void fly();
}

class WildTurkey implements  Turkey{

    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {
        System.out.println("flying flying");
    }
}