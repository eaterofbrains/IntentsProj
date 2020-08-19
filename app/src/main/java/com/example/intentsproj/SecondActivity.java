package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;

    int n1;
    int n2;

    String one;
    String two;

    TextView operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        Intent intent = getIntent();

        operation = findViewById(R.id.operation);

        one = intent.getStringExtra("number1");
        two = intent.getStringExtra("number2");

        num1.setText(one);
        num2.setText(two);

        n1 = Integer.parseInt(one);
        n2 = Integer.parseInt(two);
    }

    public void addition(View view){
        operation.setText(one + "+" + two+ "=" +(n1+n2));

    }
    public void subtraction(View view){
        operation.setText(one + "+" + two+ "=" + (n1-n2));

    }
    public void multiplication(View view){
        operation.setText(one + "+" + two+ "=" +(n1*n2));

    }
    public void division(View view){
        operation.setText(one + "+" + two+ "=" +(n1/n2));

    }
}