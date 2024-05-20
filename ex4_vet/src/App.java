import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        for(int i = 0; i<n;i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        int cont_pares = 0;
        System.out.println();
        System.out.println("NÚMEROS PARES:");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] % 2 == 0){
                System.out.print(vect[i] + " ");
                cont_pares ++;
            }
        }
        System.out.println();
        System.out.println("Quantidade de números pares = "+ cont_pares);
        sc.close();
    }
}
