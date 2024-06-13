import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class App {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println();

        // igualdade
        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);
        System.out.println(set.contains(prod));

        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println();

        // Comparando os elementos com o TreeSet
        Set<Product> treeSet = new TreeSet<>();

        treeSet.add(new Product("TV", 900.0));
        treeSet.add(new Product("Notebook", 1200.0));
        treeSet.add(new Product("Tablet", 400.0));

        for (Product p : treeSet) {
            System.out.println(p);
        }
    }
}

