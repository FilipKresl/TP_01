package tp.practicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {
    private final int id;
    private final String name;
    private final HashMap<Integer, Course> courses = new HashMap<>();

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

    public boolean enrollCourse(Course c) {
        if( courses.containsKey(c.getCode()) )
            return false;
        courses.put(c.getCode(), c);
        return true;
    }

    public boolean unenrollCourse(int code) {
        return courses.remove(code) != null;
    }

    public List<Course> getEnrolledCourses() {
        List<Course> sortedList = new ArrayList<>(courses.values());
        sortedList.sort((c1, c2) -> Integer.compare(c1.getCode(), c2.getCode()));
        return sortedList;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder(id + "-" + name);
        List<Course> sortedList = getEnrolledCourses();
        res.append("[");
        boolean firstPrint = true;
        for( Course c : sortedList ) {
            if( ! firstPrint )
                res.append(", ");
            res.append(c);
            firstPrint = false;
        }
        res.append("]");
        return res.toString();
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public boolean equals(Object o) {
        if( o == this )
            return true;
        if( o == null || getClass() != o.getClass() )
            return false;
        Student c = (Student) o;
        return id == c.getId();
    }
}
