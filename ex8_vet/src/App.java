import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int [] vect = new int[n];
        int cont_par = 1;
        int soma_par = 0;
        double media_pares = 0.0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0) {
                soma_par += vect[i];
                cont_par ++;
            }
        }
        media_pares = soma_par / cont_par;
        if (soma_par == 0) {
            System.out.println("NENHUM NÚMERO PAR");
        } else{System.out.println("MEDIA DOS PARES = " + media_pares);}

        sc.close();
    }
}
