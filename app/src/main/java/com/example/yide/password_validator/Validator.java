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


        if(!isAtLeast8)a += "Must have more than 8 characters\n";
        if(!justpassword) a += "Password can not be 'password'\n ";

        if(!hasUppercase) a += "Must have at least 1 uppercase character\n";
        if(!hasLowercase)a += "Must have at least 1 lowercase character\n";
        if(!hasNumbers)a += "Must have at least 1 number\n";
        return a;
    }

}