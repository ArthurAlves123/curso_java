import java.util.Scanner;

import entities.PrintService;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.println("How many values?");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String value = sc.next();
            ps.addValue(value);
        }
        
        ps.print();
        System.out.println("First: " + ps.firstValue());

        sc.close();
    }
}
