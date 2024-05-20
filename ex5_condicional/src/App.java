import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cod = sc.nextInt();
        int qtd = sc.nextInt();
        double preco_unit = 0.0;
        if(cod == 1){
            preco_unit = 4.0;
        }
        else if(cod == 2){
            preco_unit = 4.5;
        }
        else if(cod == 3){
            preco_unit = 5.0;
        }
        else if(cod == 4){
            preco_unit = 2.0;
        }
        else if(cod == 5){
            preco_unit = 1.5;
        }
        System.out.printf("Total: R$ %.2f%n", preco_unit*qtd);
        sc.close();
    }
}
