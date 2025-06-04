package com.adobe.Singleton;

public class SingleTonBillPugh {
    private Integer integerValue;
    private String stringValue;


    private SingleTonBillPugh() {

    }

    private static class SingleTonHelper{
        private static final SingleTonBillPugh singleTonBillPugh= new SingleTonBillPugh();
    }

    //it does not allow multiple threads to access the method at a same time
    public static SingleTonBillPugh getInstance() {

        return SingleTonHelper.singleTonBillPugh;
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
