import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double media_pond;
        for(int i = 0; i < x; i++){
            double n1, n2, n3;
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();
            media_pond = (n1*2 + n2*3 + n3*5) / (2+3+5);
            System.out.printf("%.1f%n", media_pond);
        }
        sc.close();
    }
}
