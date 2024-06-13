import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Set<Student> students = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n1 = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            students.add(new Student(sc.nextInt()));
        }

        System.out.print("How many students for course B? ");
        int n2 = sc.nextInt();

        for (int i = 0; i < n2; i++) {
            students.add(new Student(sc.nextInt()));
        }

        System.out.print("How many students for course C? ");
        int n3 = sc.nextInt();

        for (int i = 0; i < n3; i++) {
            students.add(new Student(sc.nextInt()));
        }

        System.out.println();
        System.out.println("Total students: " + students.size());

        sc.close();
    }
}
