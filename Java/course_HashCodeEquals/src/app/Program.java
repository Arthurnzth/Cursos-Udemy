package course_HashCodeEquals.src.app;

import course_HashCodeEquals.src.entities.Client;

public class Program {

    public static void main(String[] args) {
        
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Alex", "alex@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

    }

}
