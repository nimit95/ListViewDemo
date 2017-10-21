package com.list.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static String[] courses = {"Pandora", "Elixer",
            "Crux", "Launchpad"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvCourseNames = (ListView) findViewById(R.id.lv_names);

        ArrayAdapter<String> lvAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,
                android.R.id.text1, courses);


        lvCourseNames.setAdapter(lvAdapter);
    }
}
