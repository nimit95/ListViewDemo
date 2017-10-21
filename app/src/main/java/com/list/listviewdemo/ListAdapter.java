package com.list.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nimit on 21/10/17.
 */

class ListAdapter extends BaseAdapter {

    ArrayList<Course> courseList;
    Context context;

    public ListAdapter(Context context, ArrayList<Course> courseList) {
        this.context = context;
        this.courseList = courseList;
    }

    @Override
    public int getCount() {
        return courseList.size();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {


        if (view == null) {
            LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = li.inflate(R.layout.list_item, null, false);
            view.setTag(new ViewHolder(view));
        }
        String courseName = getItem(position).getName();
        String instructorName = getItem(position).getInstructor();
        int batchStrength = getItem(position).getBatchStrength();


        ((ViewHolder) view.getTag()).tvCourseName.setText(courseName);
        ((ViewHolder) view.getTag()).tvInstructorName.setText(instructorName);
        ((ViewHolder) view.getTag()).tvBatchStrength.setText(String.valueOf(batchStrength));


        return view;
    }

    static private class ViewHolder {
        TextView tvCourseName, tvInstructorName, tvBatchStrength;

        ViewHolder(View view) {

            tvCourseName = (TextView) view.findViewById(R.id.tvCourseName);
            tvInstructorName = ((TextView) view.findViewById(R.id.tvInstName));
            tvBatchStrength = ((TextView) view.findViewById(R.id.tvBatchStrength));
        }
    }

    @Override
    public Course getItem(int position) {
        return courseList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}