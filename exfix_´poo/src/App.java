import java.util.Locale;
import java.util.Scanner;

import utillities.CurrencyConverter;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter convert = new CurrencyConverter();

        System.out.print("What is the dollar price?: ");
        convert.dollar_price = sc.nextDouble();
        System.out.print("How many dollars will be dougth?: ");
        convert.qnt = sc.nextInt();
        System.out.printf("Amount to be paid in reais = %.2f%n", convert.converter());
        sc.close();
    }
}
