import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced? (y/n): ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("Addicional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);
                employees.add(emp);
            } else if(ch =='n'){
                Employee emp = new Employee(name, hours, valuePerHour);
                employees.add(emp);
            }
        }

        System.out.println("PAYMENTS: ");
        for (Employee e : employees) {
            System.out.println(e);
        }
        sc.close();
    }
}
