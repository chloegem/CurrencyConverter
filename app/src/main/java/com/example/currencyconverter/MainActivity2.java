package com.example.currencyconverter;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity2 extends AppCompatActivity {
    ActionBar actionBar;
    Spinner sp;
    EditText et1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        actionBar = getSupportActionBar();
        actionBar.setTitle("Currency Converter");
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#e68127")));
        et1 = (EditText) findViewById(R.id.amount);
        sp = (Spinner) findViewById(R.id.spinner);
        b1 = (Button) findViewById(R.id.button2);

        String[] currency = {"USD to LBP", "LBP to USD"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, currency);
        sp.setAdapter(ad);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double total;
                Double amount = Double.parseDouble(et1.getText().toString());
                if(sp.getSelectedItem().toString() == "USD to LBP"){
                    total = amount * 40000;
                    Toast.makeText(getApplicationContext(), total + " LBP", Toast.LENGTH_SHORT).show();
                }
                else if(sp.getSelectedItem().toString() == "LBP to USD"){
                    total = amount / 40000;
                    Toast.makeText(getApplicationContext(), total + " USD", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}