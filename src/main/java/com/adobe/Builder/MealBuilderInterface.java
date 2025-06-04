package com.adobe.Builder;

public interface MealBuilderInterface {
    void buildBurger();
    void buildCoolDrink();
    Meal getMeal();
}


class  vegMealBuilder implements  MealBuilderInterface{
    private Meal vegMeal= new Meal();
    @Override
    public void buildBurger(){

        vegMeal.addItem(new VegBurger());
    }

    @Override
    public void buildCoolDrink() {
        vegMeal.addItem(new coke());
    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }

}

class NonVegMealBuilder implements  MealBuilderInterface{
    private Meal nonVegMeal= new Meal();
    @Override
    public void buildBurger() {
        nonVegMeal.addItem(new ChickenBurger());
    }

    @Override
    public void buildCoolDrink() {
        nonVegMeal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return nonVegMeal;
    }
}