import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n_func,horas_trab;
        double vl_hora,salario;
        n_func = sc.nextInt();
        horas_trab = sc.nextInt();
        vl_hora = sc.nextDouble();
        salario = horas_trab * vl_hora;
        System.out.printf("O salario do funcionario %d é de U$ %.2f%n", n_func, salario);
        sc.close();
    }
}
