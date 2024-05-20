import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double taxa = 0.0;
        if(salario > 0 && salario <= 2000){
            taxa = 0.0;
        }
        else if(salario > 2000.01 && salario <= 3000){
            taxa = 0.08;
        }
        else if(salario > 3000.01 && salario <= 4500){
            taxa = 0.18;
        }
        else if(salario > 4500){
            taxa = 0.28;
        }
        System.out.printf("Valor do imposto: R$ %.2f%n", (salario-2000)*taxa);
        sc.close();
    }
}
