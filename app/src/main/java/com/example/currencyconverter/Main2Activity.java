package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Double value = intent.getDoubleExtra("value", 0);
        TextView valueDisplay = findViewById(R.id.textView2);
        valueDisplay.setText(String.format("%s%s", getString(R.string.pounds), value.toString()));
    }
}
