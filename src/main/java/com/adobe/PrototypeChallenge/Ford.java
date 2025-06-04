package com.adobe.PrototypeChallenge;

public class Ford extends BaseCar {

    public  Ford(String m){
       this.setModelName(m);
       this.setPrice(654321L);
    }
    @Override
    public void printCarModel() {

        System.out.println("Model of this car is "+this.getModelName()+" price of this car is "+this.getPrice());
    }
}
