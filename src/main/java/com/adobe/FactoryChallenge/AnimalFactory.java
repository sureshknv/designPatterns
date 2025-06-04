package com.adobe.FactoryChallenge;

public class AnimalFactory {

    public  Animal getAnimal(String animal){
        if(animal.equalsIgnoreCase("cat")){
            return new Cat();
        }else if (animal.equalsIgnoreCase("dog")){
            return  new Dog();
        }
        return null;
    }
}
