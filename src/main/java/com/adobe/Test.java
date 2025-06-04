package com.adobe;

import org.apache.commons.lang3.StringEscapeUtils;

public class Test {

    public static void main(String[] args){
        String raw = "adadfas\\\"";
        String unescaped = StringEscapeUtils.unescapeJava(raw);
        System.out.println(unescaped);
    }
}
