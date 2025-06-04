package com.adobe.FactoryChallenge;

public abstract class AnimalFactoryGang {
    abstract Animal  getAnimalFromFactory();
    public Animal getAnimal(){
        return  getAnimalFromFactory();
    }
}

