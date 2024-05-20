import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double soma = 0.0;
        double media = 0.0;

        double [] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }
        media = soma / vect.length;

        System.out.println();
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < media) {
                System.out.println(vect[i]);
           } 
        }
        sc.close();
    }
}
