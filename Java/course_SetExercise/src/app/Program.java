package course_SetExercise.src.app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import course_SetExercise.src.entities.User;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Set<User> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int answerA = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < answerA; i++) {
            int id = Integer.parseInt(sc.nextLine());
            set.add(new User(id, "A"));
        }

        System.out.print("How many students for course B? ");
        int answerB = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < answerB; i++) {
            int id = Integer.parseInt(sc.nextLine());
            set.add(new User(id, "B"));
        }

        System.out.print("How many students for course C? ");
        int answerC = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < answerC; i++) {
            int id = Integer.parseInt(sc.nextLine());
            set.add(new User(id, "C"));
        }

        System.out.println("Total students: " + set.size());

        sc.close();

    }

}
