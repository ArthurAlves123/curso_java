import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProducted;
import entities.Product;
import entities.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)?: ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name_product = sc.nextLine();
            System.out.print("Price: ");
            double price_product = sc.nextDouble();
            System.out.print("");
            if (ch == 'c') {
                Product product = new Product(name_product, price_product);
                products.add(product);
            } else if(ch == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                sc.nextLine();
                LocalDate manufacturedDate = LocalDate.parse(sc.nextLine(), fmt01);
                Product product = new UsedProduct(name_product, price_product, manufacturedDate);
                products.add(product);
            } else if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customFee = sc.nextDouble();
                Product product = new ImportedProducted(name_product, price_product, customFee);
                products.add(product);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }
        sc.close();
    }
}
