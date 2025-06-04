package com.adobe.AdapterPattern2;

public class Rectangle {
    public long length;
    public long width;
    Rectangle(){

    }
    Rectangle(long length,long width){
        this.length=length;
        this.width=width;
    }
}

class Triangle{
    public long base;
    public long height;
    Triangle(long base,long height){
        this.base=base;
        this.height=height;
    }
}
