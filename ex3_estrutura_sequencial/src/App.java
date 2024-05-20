import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,formula;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        formula = a*b - c*d;
        System.out.printf("O resultado da formula é: %d%n", formula);
        sc.close();
    }
}
