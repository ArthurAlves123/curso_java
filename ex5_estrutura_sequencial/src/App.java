import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cod_peca1,cod_peca2,qtd_peca1,qtd_peca2;
        double preco_peca1,preco_peca2,total;
        cod_peca1 = sc.nextInt();
        qtd_peca1 = sc.nextInt();
        preco_peca1 = sc.nextDouble();
        cod_peca2 = sc.nextInt();
        qtd_peca2 = sc.nextInt();
        preco_peca2 = sc.nextDouble();
        total = qtd_peca1*preco_peca1 + qtd_peca2*preco_peca2;
        System.out.printf("Total a ser pago: U$ %.2f%n", total);
        sc.close();
    }
}
