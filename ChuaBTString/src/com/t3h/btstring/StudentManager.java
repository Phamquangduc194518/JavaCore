package com.t3h.btstring;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;
    public StudentManager(){
        students = new ArrayList<>();
    }

    public void addStudent(Student s){
        students.add(s);
    }

    public void addStudent(int index, Student s){
        students.add(index, s);
    }

    public void printAllStudent(){
        for ( int i = 0; i < students.size(); i++){
//            students.get(i).printInfo();
            Student s = students.get(i);
            s.printInfo();
        }
    }

    public void sortIncreaseByAge(){
        for(int i = 0; i< students.size(); i++){
            for (int j =i+1; j<students.size();j++){
                int age1 = students.get(i).getAge(); //10
                int age2 = students.get(j).getAge(); //12
                if (age2<age1){
                    Student temp = students.get(i);


                    students.set(i,students.get(j));
                    students.set(j,temp);

                }
            }
            students.get(i).getAge();
        }
    }

    public void sortByScore(){
        for(int i=0;i<students.size();i++){
            for(int j=i+1;j<students.size();j++){
                float score1 = students.get(i).getPoint(); //10
                float score2 = students.get(j).getPoint();
                if(score1>score2){
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j,temp);
                }else if(score1==score2){
                    if(students.get(i).getAge()>students.get(j).getAge()){
                        Student temp = students.get(i);
                        students.set(i, students.get(j));
                        students.set(j,temp);
                    }
                }
            }
        }
    }

    public void sortedByName() {
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                String st1 = students.get(i).getName();
                String st2 = students.get(i).getName();
                if (st1.compareTo(st2) > 0){
                    Student temp = students.get(i);
                    students.set(i,students.get(j));
                    students.set(j,temp);
                }
            }


        }
    }

    public void sortedByNameinskep() {
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                String st1 = students.get(i).getName().toLowerCase();
                String st2 = students.get(i).getName().toLowerCase();
                if (st1.compareTo(st2) > 0){
                    Student temp = students.get(i);
                    students.set(i,students.get(j));
                    students.set(j,temp);
                }
            }


        }
    }

}
