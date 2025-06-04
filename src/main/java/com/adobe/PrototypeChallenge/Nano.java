package com.adobe.PrototypeChallenge;

public class Nano extends BaseCar {

    public  Nano(String m){
       this.setModelName(m);
       this.setPrice(123456l);
    }
    @Override
    public void printCarModel() {

        System.out.println("Model of this car is "+this.getModelName()+" price of this car is "+this.getPrice());
    }
}
