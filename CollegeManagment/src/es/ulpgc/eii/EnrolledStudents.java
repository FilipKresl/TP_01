package tp.practicas;

import java.util.*;

public class EnrolledStudents {
    public static class NameIdStudentComparator implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            int comp = s1.getName().compareTo(s2.getName());
            if( comp == 0 )
                return s1.getId() - s2.getId();
        return comp;
        }
    }

    public static class IdStudentComparator implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
                return s1.getId() - s2.getId();
        }
    }

    private final HashMap<Integer, Student> enrolledStudents = new HashMap<>();

    public EnrolledStudents() { }

    public boolean addStudent(Student s) {
        if( enrolledStudents.containsKey(s.getId()) )
            return false;
        enrolledStudents.put(s.getId(), s);
        return true;
    }

    public boolean removeStudent(int id) {
        return enrolledStudents.remove(id) != null;
    }

    public Student getStudent(int id) {
        return enrolledStudents.get(id);
    }

    // optimization - new attribute: map where key=courseKey, value=students
    public List<Student> getStudentsByCourse(int code) {
        Course tmp = new Course(code, "tmp");
        ArrayList<Student> sortedList = new ArrayList<>();
        for( Student s : enrolledStudents.values() )
            if( s.getEnrolledCourses().contains(tmp) )
                sortedList.add(s);
        sortedList.sort(new NameIdStudentComparator());
        return sortedList;
    }

    public List<Student> getStudentsOrderByName() {
        ArrayList<Student> sortedList = new ArrayList<>(enrolledStudents.values());
        sortedList.sort(new NameIdStudentComparator());
        return sortedList;
    }

    public List<Student> getStudentsOrderById() {
        ArrayList<Student> sortedList = new ArrayList<>(enrolledStudents.values());
        sortedList.sort(new IdStudentComparator());
        return sortedList;
    }
}

