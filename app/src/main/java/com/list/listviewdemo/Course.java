package com.list.listviewdemo;

/**
 * Created by nimit on 21/10/17.
 */

public class Course {
    private String name, instructor;
    private int batchStrength;

    public Course(String name, String instructor, int batchStrength) {
        this.name = name;
        this.instructor = instructor;
        this.batchStrength = batchStrength;
    }

    public String getName() {
        return name;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getBatchStrength() {
        return batchStrength;
    }
}
