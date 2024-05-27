import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CorporativeEntity;
import entities.Entity;
import entities.PhysicEntity;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Entity> entities = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Individual or company? (i/c): ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anual_income = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double health_expenditures = sc.nextDouble();
                Entity entity = new PhysicEntity(name, anual_income, health_expenditures);
                entities.add(entity);

            } else if(ch == 'c'){
                System.out.print("Number of employees: "); 
                int num_funcionarios = sc.nextInt();
                Entity entity = new CorporativeEntity(name, anual_income, num_funcionarios);
                entities.add(entity);
            }
        }
        double som_taxes = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (Entity entity : entities) {
            System.out.println(entity.toString());
            som_taxes += entity.totalTax();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: " + String.format("%.2f" , som_taxes));
        sc.close();
    }
}
