package com.adobe.FactoryChallenge;

public class CatFactory extends AnimalFactoryGang {

    @Override
    Animal getAnimalFromFactory() {
        return new Cat();
    }
}
