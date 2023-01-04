/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_swing_learning;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author vclon
 */
public class Student implements Serializable {

    public static int tempId = 1;

    private int id;
    private String name;
    private String address;
    private int age;
    private int gender; //0: Male, 1: Female
    private ArrayList<Course> courses;

    public Student(String name, String address, int age, int gender) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;

        this.courses = new ArrayList<>();

        this.id = tempId;
        tempId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean addCourse(String courseName) {
        for (Course var : courses) {
            if (courseName.equals(var.getCourseName())) {
                return false;
            }
        }
        this.courses.add(new Course(courseName));
        return true;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public boolean setMark(String courseName, int mark) {
        for (Course var : courses) {
            if (courseName.equals(var.getCourseName())) {
                var.setMark(mark);
                return true;
            }
        }
        return false;
    }

}
