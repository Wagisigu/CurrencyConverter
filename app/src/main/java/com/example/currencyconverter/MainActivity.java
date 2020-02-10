package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void convert(View view) {
        double initialValue = Double.valueOf(((EditText) findViewById(R.id.editText)).getText().toString());
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("value", initialValue*0.77);
        startActivity(intent);
    }
}
