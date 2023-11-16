package tp.practicas;

public class Course {
    private final int code;
    private final String name;

    public Course(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "(" + code + ")" + name;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(code);
    }

    @Override
    public boolean equals(Object o) {
        if( o == this )
            return true;
        if( o == null || getClass() != o.getClass() )
            return false;
        Course c = (Course) o;
        return code == c.getCode();
    }
}
