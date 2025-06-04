package com.adobe.AdapterPattern;

public class Client {


   public static void main(String[] args){
       MallardDuck mallardDuck=new MallardDuck();
       WildTurkey wildTurkey= new WildTurkey();
       Duck turkeyAdapter=new Adapter(wildTurkey);
       turkeyAdapter.quack();
       turkeyAdapter.fly();
//       Duck duck= new Adapter();
//       duck.quack();
//       duck.fly();
   }

}
