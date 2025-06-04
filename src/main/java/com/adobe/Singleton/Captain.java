package com.adobe.Singleton;

public class Captain {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private Captain(String s){
        name=s;
    }
    private  static class  CaptainHelper{
        private  static final Captain captain= new Captain("Singh");
    }
    public static Captain getInstance(){
        return  CaptainHelper.captain;
    }
}
