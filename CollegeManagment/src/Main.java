import es.ulpgc.eii.Course;
import es.ulpgc.eii.Student;

public class Main {
    public static void main(String[] args) {
        Course math = new Course(1, "math");
        Course physics = new Course(5, "physics");
        Course geo = new Course(3, "geo");
        Student betty = new Student(21, "betty");
        System.out.println(betty.enrollCourse(math));
        System.out.println(betty.enrollCourse(physics));
        System.out.println(betty.enrollCourse(geo));
        betty.showCourses();
        System.out.println(betty.unenrollCourse(6));
        betty.showCourses();
        System.out.println(betty.unenrollCourse(1));
        betty.showCourses();
    }
}