package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class getWeight extends AppCompatActivity {

    EditText getWeight;
    TextView goToGetWeight, backToMap;
    Intent getInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_weight);
        setTitle("Input Weight");

        getWeight = findViewById(R.id.getWeight);
        goToGetWeight = findViewById(R.id.goToGetWeight);
        backToMap = findViewById(R.id.backToMap2);

        goToGetWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getWeight.getText() == null) {
                    Toast.makeText(getApplicationContext(), "Please Input Weight", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(com.example.androidproject.getWeight.this, Calorie.class);
                    intent.putExtra("Weight", Double.parseDouble(getWeight.getText().toString()));
                    getInt = getIntent();
                    double dis = getInt.getDoubleExtra("distance", 1);
                    intent.putExtra("distance", dis / 6.0);
                    startActivityForResult(intent, 1);
                }
            }
        });

        backToMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
