package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Currency Converter");
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#e68127")));
    }

    public void onClick(View v){

        EditText user = (EditText)findViewById(R.id.user);
        EditText password = (EditText)findViewById(R.id.password);

        String user_val = user.getText().toString();
        String pass_val = password.getText().toString();

        if(user_val.equals("user.leb") && pass_val.equals("123456")){
            Toast.makeText(getApplicationContext(), "Signed In!",Toast.LENGTH_LONG).show();
            Intent i= new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(i);
        }else{
            Toast.makeText(getApplicationContext(), "Invalid Input!",Toast.LENGTH_LONG).show();
        }
    }
}
