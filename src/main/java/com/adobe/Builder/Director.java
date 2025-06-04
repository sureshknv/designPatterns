package com.adobe.Builder;

public class Director {
    MealBuilderInterface mealBuilderInterface;
    public  void  construct(MealBuilderInterface mealBuilderInterface){
        this.mealBuilderInterface= mealBuilderInterface;
        mealBuilderInterface.buildBurger();;
        mealBuilderInterface.buildCoolDrink();
    }
}
