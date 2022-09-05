package com.platzi.javatests.util;

public class PasswordUtil {
    public enum SecutiryLevel {
        WEAK, MEDIMUM, STRONG
    }

    public static SecutiryLevel assessPasword(String password) {
        if (password.length() < 8 || password.matches("[a-zA-Z]+")) return SecutiryLevel.WEAK;
        if (password.matches("[a-zA-Z0-9]+")) return SecutiryLevel.MEDIMUM;
        return SecutiryLevel.STRONG;
    }
}
