import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            System.out.print("Enter salary: ");
            double maxSalary = sc.nextDouble();

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");

                String name = fields[0];
                String email = fields[1];
                double salary = Double.parseDouble(fields[2]);

                list.add(new Employee(name, email, salary));

                line = br.readLine();
            }

            List<String> emails = list.stream().filter(e -> e.getSalary() > maxSalary).map(e -> e.getEmail()).sorted().collect(Collectors.toList());

            emails.forEach(System.out::println);

            double sum = list.stream().filter(x -> x.getName().toUpperCase().charAt(0) == 'M').map(x -> x.getSalary()).reduce(0.0, (x,y) -> x + y);

            System.out.printf("Sum of salary of people whose name starts with 'M': %.2f%n", sum);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
