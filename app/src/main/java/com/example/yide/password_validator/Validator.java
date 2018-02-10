package com.example.yide.password_validator;

/**
 * Created by Yide on 2018/2/10.
 */

public class Validator {

    public static String validate(String password)
    {
        String a = "";
        boolean isAtLeast8   = password.length() >= 8;
        boolean justpassword = !password.equals("password");

        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasLowercase = !password.equals(password.toUpperCase());
        boolean hasNumbers = password.matches(".*[0-9].*");


        if(!isAtLeast8)a += "\nMust have more than 8 characters";
        if(!justpassword) a += "\nPassword can not be 'password' ";

        if(!hasUppercase) a += "\nMust have at least 1 uppercase character";
        if(!hasLowercase)a += "\nMust have at least 1 lowercase character";
        if(!hasNumbers)a += "\nMust have at least 1 number";
        return a;
    }

}