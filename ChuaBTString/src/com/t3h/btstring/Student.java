package com.t3h.btstring;

public class Student {
    private String name;
    private int age;
    private float point;

    public Student(String name, int age, float point) {
        this.name = name;
        this.age = age;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getPoint() {
        return point;
    }

    public void printInfo(){
        System.out.println("name: "+ name+", age: "+ age+", point: "+ point);
    }
}
