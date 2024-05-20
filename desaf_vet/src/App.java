import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluguel[] alugueis = new Aluguel[10];

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Aluguel #" + (i+1) + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            int n_quarto;
            do{
                System.out.print("Quarto: ");
                n_quarto = sc.nextInt();
                if(alugueis[n_quarto] != null){
                    System.out.println("QUARTO OCUPADO. ESCOLHA OUTRO QUARTO:");
                }
                if (n_quarto < 0 || n_quarto > 9) {
                    System.out.println("ESSE QUANTO NÃO EXISTE.");
                }
            }while(alugueis[n_quarto] != null);

            alugueis[n_quarto] = new Aluguel(nome, email, n_quarto);
        }
        
        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < alugueis.length; i++) {
            if (alugueis[i] != null) {
                System.out.printf("%d: %s, %s%n", alugueis[i].getN_quarto(), alugueis[i].getNome(), alugueis[i].getEmail());
            }
        }
        sc.close();
    }
}
