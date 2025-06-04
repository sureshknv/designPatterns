package com.adobe.Singleton;

public class SingleTonEager {
    private Integer integerValue;
    private String stringValue;
    private static  SingleTonEager SingleTonDoubleCheck = new SingleTonEager();

    private SingleTonEager() {

    }

    //it does not allow multiple threads to access the method at a same time
    public static SingleTonEager getInstance() {

        return SingleTonDoubleCheck;
    }

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    public Integer getIntegerValue() {
        return integerValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getStringValue() {
        return stringValue;
    }
}
