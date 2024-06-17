import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class App {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		double min = 100.0;

        // Predicate<Product> pred = p -> p.getPrice() >= min;
        // list.removeIf(new ProductPredicate);
        // list.removeIf(Product::staticProductPredicate);
        // list.removeIf(Product::nonStaticProductPredicate);
		list.removeIf(p -> p.getPrice() >= min);

		for (Product p : list) {
			System.out.println(p);
		}
	}
}
