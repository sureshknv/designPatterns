package com.adobe.FactoryChallenge;

public class AnimalFactoryClient {

    public  static void main(String[] args){
        AnimalFactoryGang afg= new CatFactory();
        Animal animal=afg.getAnimal();
        animal.makeSound();
    }
}
