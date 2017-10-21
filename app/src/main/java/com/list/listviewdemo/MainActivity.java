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

        ListAdapter listAdapter = new ListAdapter(getCourseList());

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

    class ListAdapter extends BaseAdapter {

        ArrayList<Course> courseList;

        public ListAdapter(ArrayList<Course> courseList) {
            this.courseList = courseList;
        }

        @Override
        public int getCount() {
            return courseList.size();
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {


            if(view == null) {
                view = getLayoutInflater().inflate(R.layout.list_item, null, false);
            }
            String courseName = courseList.get(position).getName();
            String instructorName = courseList.get(position).getInstructor();
            int batchStrength = courseList.get(position).getBatchStrength();


            ((TextView)view.findViewById(R.id.tvCourseName)).setText(courseName);
            ((TextView)view.findViewById(R.id.tvInstName)).setText(instructorName);
            ((TextView)view.findViewById(R.id.tvBatchStrength)).setText(String.valueOf(batchStrength));


            return view;
        }


        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }
    }
}
