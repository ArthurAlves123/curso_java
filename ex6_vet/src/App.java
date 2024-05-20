import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int [] vet1 = new int[n];
        int [] vet2 = new int[n];
        int [] vetResp = new int[n];
        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < vet1.length; i++){
            vet1[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for(int i = 0; i < vet2.length; i++){
            vet2[i] = sc.nextInt();
        }

        System.out.println("Vetor resultante: ");
        for(int i = 0; i < vetResp.length; i++){
            vetResp[i] = vet1[i] + vet2[i];
            System.out.println(vetResp[i]);
        }

        sc.close();
    }
}
