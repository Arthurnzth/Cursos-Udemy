package Udemy.Java.course_Pensionato.src.entities;

public class Student {

    private String name;
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public Student(){
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    
}
