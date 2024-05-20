import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double soma = 0.0;
        for(int i = 0; i<n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        System.out.print("Valores = ");
        for(int i = 0; i < vect.length; i++){
            System.out.print(vect[i] + " ");
        }
        System.out.println();
        System.out.println("Soma = " + soma);
        System.out.println("Média = " + soma/vect.length);

        sc.close();
    }
}
