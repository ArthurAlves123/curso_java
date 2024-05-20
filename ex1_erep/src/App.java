import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua senha: ");
        int senha = sc.nextInt();
        while(senha != 2002){
            System.out.println("Senha Invalida!");
            System.out.print("Digite a sua senha: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido.");
        sc.close();
    }
}
