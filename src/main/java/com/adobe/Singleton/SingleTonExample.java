package com.adobe.Singleton;

public class SingleTonExample {
    private Integer integerValue;
    private String stringValue;
    private static SingleTonExample singleTonExample;

    private SingleTonExample() {

    }

    public static SingleTonExample getInstance() {
        if (singleTonExample == null) {
            singleTonExample = new SingleTonExample();
        }
        return singleTonExample;
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