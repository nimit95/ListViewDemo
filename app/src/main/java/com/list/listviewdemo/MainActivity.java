package com.list.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvCourseNames = (ListView) findViewById(R.id.lv_names);

        ListAdapter listAdapter = new ListAdapter(MainActivity.this, getCourseList());

        lvCourseNames.setAdapter(listAdapter);
    }

    public static ArrayList<Course> getCourseList() {
        ArrayList<Course> courseArrayList = new ArrayList<>();

        courseArrayList.add(new Course("Pandora", "Arnav", 60));
        courseArrayList.add(new Course("Elixer", "Arnav", 50));
        courseArrayList.add(new Course("Crux", "Sumit", 60));
        courseArrayList.add(new Course("Launchpad", "Prateek", 60));

        courseArrayList.add(new Course("Pandora", "Arnav", 60));
        courseArrayList.add(new Course("Elixer", "Arnav", 50));
        courseArrayList.add(new Course("Crux", "Sumit", 60));
        courseArrayList.add(new Course("Launchpad", "Prateek", 60));

        courseArrayList.add(new Course("Pandora", "Arnav", 60));
        courseArrayList.add(new Course("Elixer", "Arnav", 50));
        courseArrayList.add(new Course("Crux", "Sumit", 60));
        courseArrayList.add(new Course("Launchpad", "Prateek", 60));

        courseArrayList.add(new Course("Pandora", "Arnav", 60));
        courseArrayList.add(new Course("Elixer", "Arnav", 50));
        courseArrayList.add(new Course("Crux", "Sumit", 60));
        courseArrayList.add(new Course("Launchpad", "Prateek", 60));

        courseArrayList.add(new Course("Pandora", "Arnav", 60));
        courseArrayList.add(new Course("Elixer", "Arnav", 50));
        courseArrayList.add(new Course("Crux", "Sumit", 60));
        courseArrayList.add(new Course("Launchpad", "Prateek", 60));

        courseArrayList.add(new Course("Pandora", "Arnav", 60));
        courseArrayList.add(new Course("Elixer", "Arnav", 50));
        courseArrayList.add(new Course("Crux", "Sumit", 60));
        courseArrayList.add(new Course("Launchpad", "Prateek", 60));

        courseArrayList.add(new Course("Pandora", "Arnav", 60));
        courseArrayList.add(new Course("Elixer", "Arnav", 50));
        courseArrayList.add(new Course("Crux", "Sumit", 60));
        courseArrayList.add(new Course("Launchpad", "Prateek", 60));

        courseArrayList.add(new Course("Pandora", "Arnav", 60));
        courseArrayList.add(new Course("Elixer", "Arnav", 50));
        courseArrayList.add(new Course("Crux", "Sumit", 60));
        courseArrayList.add(new Course("Launchpad", "Prateek", 60));

        courseArrayList.add(new Course("Pandora", "Arnav", 60));
        courseArrayList.add(new Course("Elixer", "Arnav", 50));
        courseArrayList.add(new Course("Crux", "Sumit", 60));
        courseArrayList.add(new Course("Launchpad", "Prateek", 60));



        return courseArrayList;
    }


}
