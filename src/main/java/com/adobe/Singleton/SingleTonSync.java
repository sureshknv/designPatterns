package com.adobe.Singleton;

public class SingleTonSync {
    private Integer integerValue;
    private String stringValue;
    private static SingleTonSync SingleTonSync;

    private SingleTonSync() {

    }

    //it does not allow multiple threads to access the method at a same time
    public static synchronized SingleTonSync getInstance() {
        if (SingleTonSync == null) {
            SingleTonSync = new SingleTonSync();
        }
        return SingleTonSync;
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
