package com.example.yide.password_validator;

import org.junit.Test;

/**
 * Created by new on 2/10/2018.
 */
public class ValidatorTest {
    @Test
    public void validate() throws Exception {
      String a = "ss1sss";
      Validator vd= new Validator();
      System.out.print(vd.validate(a));


    }

}