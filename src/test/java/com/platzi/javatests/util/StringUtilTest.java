package com.platzi.javatests.util;

public class StringUtilTest {

    public static void main(String[] args) {
        String result = StringUtil.repeat("hola", 3);
        System.out.println(result);
        if(result.equals("holaholahola")) {
            System.out.println("Ok");
        }
    }

}