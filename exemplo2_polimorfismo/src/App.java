import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entitiesEnums.Color;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        List<Shape> shapes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle? (r/c): ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                Shape shape = new Rectangle(color, width, height);
                shapes.add(shape);
            } else if(ch == 'c'){
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                Shape shape = new Circle(color, radius);
                shapes.add(shape);
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape s : shapes) {
            System.out.println(String.format("%.2f", s.area()) );
        }
        sc.close();
    }
}
