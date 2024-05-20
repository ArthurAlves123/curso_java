import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno;
        aluno = new Aluno();
        aluno.nome = sc.nextLine();
        aluno.n1 = sc.nextDouble();
        aluno.n2 = sc.nextDouble();
        aluno.n3 = sc.nextDouble();
        
        System.out.printf("FINAL GRADE: %.2f%n", aluno.final_grade());
        aluno.aproved();
        sc.close();
    }
}
