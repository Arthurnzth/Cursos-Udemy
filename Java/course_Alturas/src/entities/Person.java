package course_Alturas.src.entities;

public class Person {

    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getHeight(){
        return height;
    }

    public double media(double soma, int n){
        return soma/n;
    }
    public double percet(int n, int cont){
        return cont*100/n;
    }

}