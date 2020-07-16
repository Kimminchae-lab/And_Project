package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Destination extends AppCompatActivity {
    ListView listView;
    TextView backToMap;
    ArrayList<String> desList;
    String temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);
        setTitle("Recent Destination");

        listView = findViewById(R.id.listView);
        backToMap = findViewById(R.id.backToMap1);

        int cnt = 0;
        desList = new ArrayList<>();

        Intent intent = getIntent();


        if (temp != intent.getStringExtra("destination")) {
            desList.add(cnt, intent.getStringExtra("destination"));
            cnt++;
            temp = intent.getStringExtra("destination");
        }

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, desList);
        listView.setAdapter(adapter);

        backToMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
