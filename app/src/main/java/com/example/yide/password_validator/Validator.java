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

        if(!isAtLeast8)a += "\nMust have more than 8 characters";
        if(!justpassword) a += "\nPassword can not be 'password' ";
        return a;
    }

}