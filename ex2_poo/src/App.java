import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee;
        employee = new Employee();
        System.out.print("NAME: ");
        employee.name = sc.nextLine();
        System.out.print("Groos Salary: ");
        employee.groossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        
        System.out.println("Employee: " + employee.toString());
        System.out.println("Which percentage o increase salary?");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Updated data: " + employee.toString());
        sc.close();
        
    }
}
