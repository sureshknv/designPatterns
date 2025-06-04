package com.adobe.Singleton;

public class SingleTonSyncExm {
    public static void main(String[] args){
        SingleTonSync se= SingleTonSync.getInstance();
        se.setIntegerValue(121);
        se.setStringValue("This is nine world");
        System.out.println(se.getIntegerValue());
        se=null;
        se= SingleTonSync.getInstance();
        System.out.println(se.getStringValue());

    }

}
