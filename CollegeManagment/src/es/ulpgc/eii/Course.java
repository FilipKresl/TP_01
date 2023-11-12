package es.ulpgc.eii;

public class Course {
    private int code;
    private String name;

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

    public String toString(){
        String id = "(" + code + ")" + name;
        //System.out.println(id);
        return id;
    }
}
