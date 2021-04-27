package com.example.gyakorlas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView kiir = findViewById(R.id.kiir);

        Bundle extras = getIntent().getExtras();

        if (extras != null){
            kiir.setText(extras.getString("adat"));
        }

    }
}