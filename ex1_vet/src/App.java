import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        for(int i = 0; i < n;i++){
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            vect[i] = num;
        }
        System.out.println("NÚMEROS NEGATIVOS: ");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}
