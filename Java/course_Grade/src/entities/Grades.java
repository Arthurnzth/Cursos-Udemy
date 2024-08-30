package Udemy.Java.course_Grade.src.entities;

public class Grades {

    public String name;
    public double firstQuarter;
    public double secondQuarter;
    public double thirdQuarter;
    
    public double finalGrade(){
        return firstQuarter+secondQuarter+thirdQuarter;
    }
    public double missingPoints(){
        if(finalGrade()<60){
            return 60-finalGrade();
        }
        else{
            return 0;
        }
    }

}