import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double pi = 3.14159;
        double area_circulo = pi * Math.pow(raio,2);
        System.out.printf("A área do circulo é %.4f%n", area_circulo);
        sc.close();
    }
}
