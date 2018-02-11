package com.example.yide.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;

import android.widget.EditText;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input;
    Button button;
    TextView output;
    Validator validator;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        validator = new Validator();

        input = (EditText) findViewById(R.id.infield);
        button = (Button) findViewById(R.id.butt);
        output = (TextView) findViewById(R.id.textfield);

        button.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){

                String Password = input.getText().toString();
                if (validator.validate(Password).isEmpty()){
                    output.setText("Your password is Strong!");
                }
                else{
                    output.setText(validator.validate(Password));
                }

            }

        });
    }
}
