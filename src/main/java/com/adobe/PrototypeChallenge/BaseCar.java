package com.adobe.PrototypeChallenge;

public abstract class BaseCar implements Cloneable {
    private String modelName;
    private long price;
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
    public BaseCar clone() throws CloneNotSupportedException {
     return  (BaseCar) super.clone();
    }

    public abstract void  printCarModel();
}
