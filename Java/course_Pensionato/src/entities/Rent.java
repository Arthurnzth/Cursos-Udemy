package Udemy.Java.course_Pensionato.src.entities;

public class Rent {

    private String name;
    private String email;

    public Rent(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public Rent(){
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }

    public String toString(){
        return name + ", " + email;
    }
    
}
