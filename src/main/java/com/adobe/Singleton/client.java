package com.adobe.Singleton;

public class client {
    public  static void main(String [] args){
        Captain c=Captain.getInstance();
        System.out.println("Captain is "+ c.getName() + " object reference is "+ c);
        Captain ca= Captain.getInstance();
        ca.setName("Suresh");
        System.out.println("Captain is "+ ca.getName() + " object reference is "+ ca);

    }
}
