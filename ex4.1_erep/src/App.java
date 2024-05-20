import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double result = 0.0;
        for(int i = 0; i < x; i++){
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            result = n1 / n2;
            if(n2 == 0){
                System.out.println("divisão impossivel!");
            }else{System.out.printf("%.1f%n",result);}
        }
        sc.close();
    }
}
