package com.adobe.Singleton;

public class SingleTonDoubleCheck {
    private Integer integerValue;
    private String stringValue;
    private static volatile SingleTonDoubleCheck SingleTonDoubleCheck;

    private SingleTonDoubleCheck() {

    }

    //it does not allow multiple threads to access the method at a same time
    public static  SingleTonDoubleCheck getInstance() {
        if (SingleTonDoubleCheck == null) {
            synchronized(com.adobe.Singleton.SingleTonDoubleCheck.class){
                if(SingleTonDoubleCheck == null){
                    SingleTonDoubleCheck = new SingleTonDoubleCheck();
                }
            }
        }
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
