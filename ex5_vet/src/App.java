import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        for(int i = 0; i<n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();

        }

        double maior_valor = 0.0;
        int posi_ml = 0;

        for(int i = 0; i < vect.length; i++){
            if(vect[i] > maior_valor){
                maior_valor = vect[i];
                posi_ml = i;
            }
        }

        System.out.println("MAIOR VALOR: " + maior_valor);
        System.out.println("POSIÇÃO DO MAIOR VALOR: " + posi_ml);
        sc.close();
    }
}
