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
public class Course implements Serializable {

    public static ArrayList<String> courses = new ArrayList<>();

    private String courseName;
    private int mark;

    public Course(String courseName) {
        this.courseName = courseName;
        this.mark = -1;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

}
