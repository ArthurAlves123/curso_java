import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][] mat = new int[n] [n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
                
            }
        }
        int cont_neg = 0;

        System.out.println("Diagonal Principal: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    System.out.print(mat[i][j] + " ");
                }
                if(mat[i][j] < 0){
                    cont_neg ++;
                }
            }
        }
        System.out.println();
        System.out.println("Quantidade de números negativos: " + cont_neg);
        sc.close();
    }
}
