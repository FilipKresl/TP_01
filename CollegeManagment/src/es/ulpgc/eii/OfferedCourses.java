package tp.practicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OfferedCourses {
    private final HashMap<Integer, Course> offeredCourses = new HashMap<>();

    public OfferedCourses() { }

    public boolean addCourse(Course c) {
        if( offeredCourses.containsKey(c.getCode()) )
            return false;
        offeredCourses.put(c.getCode(), c);
        return true;
    }

    public boolean removeCourse(int code) {
        return offeredCourses.remove(code) != null;
    }

    public Course getCourse(int code) {
        return offeredCourses.get(code);
    }

    public List<Course> getCourses() {
        ArrayList<Course> sortedList = new ArrayList<>(offeredCourses.values());
        sortedList.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));
        return sortedList;
    }
}
