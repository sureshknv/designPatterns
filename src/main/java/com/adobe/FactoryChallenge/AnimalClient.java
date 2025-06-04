package com.adobe.FactoryChallenge;

public class AnimalClient {
    public  static  void main(String[] args){
        AnimalFactory af= new AnimalFactory();
        Animal a= af.getAnimal("cat");
        a.makeSound();
    }
}
