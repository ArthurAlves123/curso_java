import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle;
        rectangle = new Rectangle();

        System.out.println("Enter rectangle width and heigth: ");
        System.out.print("Width: ");
        rectangle.width = sc.nextDouble();
        System.out.print("Heigth: ");
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA: %.2f%n", rectangle.area());
        System.out.printf("PERIMETER: %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL: %.2f%n", rectangle.diagonal());
        sc.close();
    }
}
