package com.adobe.Singleton;

public class SingleTonClient {

public static  void main(String [] args){
    SingleTonExample se= SingleTonExample.getInstance();
    se.setIntegerValue(121);
    se.setStringValue("This is nine world");
    System.out.println(se.getIntegerValue());
    se=null;
    se= SingleTonExample.getInstance();
    System.out.println(se.getStringValue());

}
}
