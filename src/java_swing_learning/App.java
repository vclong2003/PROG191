/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_swing_learning;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.File;

/**
 *
 * @author vclon
 */
public class App implements Serializable {

    public static HashMap<String, Object> props = new HashMap<>();

    public static ArrayList<Student> studentList = new ArrayList<>();

    public static StudentInfoForm infoForm = new StudentInfoForm();

    public static CourseManagementForm courseManagementFrom = new CourseManagementForm();

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        //initial data read
        try {
            readFromDataFile();
        } catch (IOException ex) {
            System.out.println(ex);
        }

        infoForm.setVisible(true);
    }

    public static void writeDataToFile() throws FileNotFoundException, IOException {
        props.put("studentList", studentList);
        props.put("tempId", Student.tempId);
        props.put("courseList", Course.courses);

        FileOutputStream propsDataOut = new FileOutputStream("data.txt");
        ObjectOutputStream propsDataOutObj = new ObjectOutputStream(propsDataOut);
        propsDataOutObj.writeObject(props);
        propsDataOutObj.flush();
        propsDataOutObj.close();

        System.out.println("file written");
    }

    public static void readFromDataFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream propsDataIn = new FileInputStream("data.txt");
        ObjectInputStream propsDataInObj = new ObjectInputStream(propsDataIn);
        props = (HashMap<String, Object>) propsDataInObj.readObject();
        propsDataInObj.close();

        Student.tempId = (Integer) props.get("tempId");
        studentList = (ArrayList<Student>) props.get("studentList");
        Course.courses = (ArrayList<String>) props.get("courseList");

        System.out.println("file read");
    }

    public static void deleteDataFile() throws FileNotFoundException, IOException {
        File dataFile = new File("data.txt");
        dataFile.delete();

        System.out.println("file deleted");
    }
}
