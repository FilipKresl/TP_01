package es.ulpgc.eii;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Student {
    private int id;
    private String name;

    private ArrayList<Course> courses = new ArrayList<>();

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean enrollCourse(Course ncourse){
        if(courses.contains(ncourse)){
            return false;
        }
        else {
            courses.add(ncourse);
            return true;
        }
    }
    public void showCourses(){
        for(Course c : courses){
            System.out.println(c);
        }
    }

    public boolean unenrollCourse(int i){
        for(int t = 0; t < courses.size(); t++){
            if(courses.get(t).getCode() == i){
                Course remove = courses.remove(t);
                return true;
            }
        }
        return false;
    }
    public HashSet<Course> getEnrolledCourses(){
        HashSet<Course> clist = new HashSet<>();
        for(Course p : courses){
            clist.add(p);
        }

    }
    public String toString(){
        String s = this.id + "-" + this.name;
    }
}
