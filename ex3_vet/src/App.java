import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Pessoa[] vect = new Pessoa[n];
        for(int i = 0; i < n; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            vect[i] = new Pessoa(nome, idade, altura);
        }
        double soma = 0.0;
        int cont = 0;
        for(int i = 0; i< vect.length; i++){
            soma += vect[i].getAltura();
            if(vect[i].getIdade() < 16){
                cont += 1;
            }
        }

        System.out.println();
        System.out.printf("Altura média: %.2f%n", soma / vect.length);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", ((double)cont/vect.length) * 100);
        for(int i = 0; i < vect.length; i++){
            if(vect[i].getIdade() < 16){
                System.out.println(vect[i].getNome());
            }
        }
        sc.close();
    }
}
