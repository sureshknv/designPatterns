package com.adobe.AbstractFactory;

public interface Color {
    public void fillColor();
}

class Red implements Color{

    @Override
    public void fillColor() {
        System.out.println("This is Red");
    }
}
class Green implements Color{

    @Override
    public void fillColor() {
        System.out.println("This is Green");
    }
}
class Yellow implements Color{

    @Override
    public void fillColor() {
        System.out.println("This is Yellow");
    }
}