package com.adobe.Builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items;

    public Meal(){
        items= new ArrayList<>();
    }
    public  void addItem(Item item){
        items.add(item);
    }
    public float getCost(){
        float cost=0;
        for(Item item:items){
            cost=cost+item.price();
        }
        return cost;
    }
    public void showItems(){
        for(Item item: items){
            System.out.println("Item is "+ item.name());
            System.out.println("Price is "+item.price());
            System.out.println("Packaging is "+item.packaging().Pack() );
        }
    }

}
