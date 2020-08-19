package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //text obj definitions
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

    }

    //function to open second activity
    public void secondActivity(View view){
        Intent intent = new Intent(this,SecondActivity.class);

        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
    //Getting the View object as defined in the customtoast.xml file View layout = li.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));
    //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();

        intent.putExtra("name1", num1.getText().toString());
        intent.putExtra("name2", num2.getText().toString());
        Toast.makeText(this, "Loading Calculator...", Toast.LENGTH_SHORT).show();

        startActivity(intent);

    }





}