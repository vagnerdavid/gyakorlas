package com.example.gyakorlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText text = findViewById(R.id.editText);
        Button gomb = findViewById(R.id.gomb);

        gomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atad = new Intent(MainActivity.this, SecondActivity.class);
                atad.putExtra("adat", gomb.getText().toString());
                startActivity(atad);
            }
        });
    }
    public int osszeAd(int d, int c) {
        return d + c;
    }
}