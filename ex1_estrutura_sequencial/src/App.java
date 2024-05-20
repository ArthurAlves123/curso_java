import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int result = n1 + n2;
        System.out.printf("Resultado: %d%n", result);
    }
}
