package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Calorie extends AppCompatActivity {

    TextView cal;
    TextView backToMap;
    Double weight, distance;
    Double kCal;

    // region onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie);
        setTitle("Calorie");

        cal = findViewById(R.id.cal);
        backToMap = findViewById(R.id.backToMap);

        Intent intent = getIntent();
        weight = intent.getDoubleExtra("Weight", 1);
        distance = intent.getDoubleExtra("distance", 1);

        kCal = ((3.5 * 4 * weight * (distance / 6.0)) / 1000.0) * 5.0;

        cal.setText(kCal.toString() + " Kcal");

        backToMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    // endregion

}
