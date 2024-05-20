import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos aluno serão digitados? ");
        int n = sc.nextInt();

        Aluno[] aluno = new Aluno[n];

        for (int i = 0; i < aluno.length; i++) {
            System.out.println("Digite o nome do " + (i+1) + "o aluno: ");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Nota do 1º bimestre: ");
            double nota1 = sc.nextDouble();
            System.out.print("Nota do 2º bimestre: ");
            double nota2 = sc.nextDouble();

            aluno[i] = new Aluno(nome, nota1, nota2);
        }

        System.out.println();
        System.out.println("ALUNO APROVADOS: ");

        for (int i = 0; i < aluno.length; i++) {
            if(aluno[i].media() >= 6.0){
                System.out.println(aluno[i].getNome());
            }
        }
        sc.close();
    }
}
