package com.adobe.FactoryChallenge;

public class DogFactory extends AnimalFactoryGang {

    @Override
    Animal getAnimalFromFactory() {
        return new Dog();
    }
}
