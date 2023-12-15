package com.example.qrdolgozat;

public class ListItem {
    public Number id;
    public String name;
    public Number grade;
    public ListItem(Number id, String name, Number grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    public Number getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Number getGrade() {
        return grade;
    }
}

