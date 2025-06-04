package com.adobe.Builder;

public class Client {
    public  static void main(String args[]){
        Director d= new Director();
        MealBuilderInterface vegMealBuilder= new vegMealBuilder();
        MealBuilderInterface nonVegMealBuilder= new NonVegMealBuilder();
        d.construct(vegMealBuilder);
        Meal vegMeal=vegMealBuilder.getMeal();
        vegMeal.showItems();
        System.out.println("Total cost "+ vegMeal.getCost());
        d.construct(nonVegMealBuilder);
        Meal nonVegMeal= nonVegMealBuilder.getMeal();
        nonVegMeal.showItems();
        System.out.println("Total cost "+ nonVegMeal.getCost());

    }
}
