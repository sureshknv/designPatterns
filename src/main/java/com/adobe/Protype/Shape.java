package com.adobe.Protype;

public abstract class Shape implements  Cloneable{
    private String value;
    private String id;
    protected String type;
    abstract void draw();
    public Object clone() throws CloneNotSupportedException {
        try{
            return  super.clone();
        }catch (CloneNotSupportedException e){
            throw e;
        }

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

class  Rectangle extends Shape{
    Rectangle(){
        this.type="Rectangle";

    }

    @Override
    void draw() {
        System.out.println("This is rectangle");
    }
}

class  Square extends Shape{
    Square(){
        this.type="Square";

    }

    @Override
    void draw() {
        System.out.println("This is Square");
    }
}