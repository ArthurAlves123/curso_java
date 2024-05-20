import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas você vai cadastrar? ");
        int n = sc.nextInt();
        Pessoa[] pessoa = new Pessoa[n];
        int maior_idade = 0, posi_mais_velho = 0;

        for (int i = 0; i < pessoa.length; i++) {
            String name = null;
            int age = 0;
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            name = sc.nextLine();

            System.out.print("Idade: ");
            age = sc.nextInt();

            pessoa[i] = new Pessoa(name, age);

            if (pessoa[i].getAge() > maior_idade) {
                maior_idade = pessoa[i].getAge();
                posi_mais_velho = i;
            }
        }

        System.out.println("Pessoa mais velha: " + pessoa[posi_mais_velho].getName());

        sc.close();
    }
}
