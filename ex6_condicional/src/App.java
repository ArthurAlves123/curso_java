import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double vl = sc.nextDouble();
        if(vl > 0.0 && vl <= 25.0){
            System.out.println("Intervalo [0, 25]");
        }
        else if(vl > 25.0 && vl <= 50.0){
            System.out.println("Intervalo [25, 50]");
        }
        else if(vl > 50.0 && vl <= 75.0){
            System.out.println("Intervalo [50, 75]");
        }
        else if(vl > 75.0 && vl <= 100.0){
            System.out.println("Intervalo [75, 100]");
        } else {
            System.out.println("Fora de intervalo!");
        }
        sc.close();
    }
}
