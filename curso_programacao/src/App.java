import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double vl_metro = sc.nextDouble();
        
        double area = comprimento * largura;
        double preco = area * vl_metro;
        System.out.printf("A área total do terreno é %.2f%n", area);
        System.out.printf("O preço total do terreno é %.2f", preco);
    }
}
