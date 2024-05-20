import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        double som_alt_mulheres = 0.0, media_alt_mulheres = 0.0;
        int cont_mulheres = 0, cont_homens = 0;

        Pessoa[] pessoa = new Pessoa[n];
        for (int i = 0; i < pessoa.length; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            double altura = sc.nextDouble();
            System.out.print("Genero da " + (i+1) + "a pessoa: ");
            char genero = sc.next().charAt(0);

            pessoa[i] = new Pessoa(altura, genero);
        }

        double menor_alt = pessoa[0].getAltura();
        double maior_alt = 0.0;

        for (int i = 0; i < pessoa.length; i++) {
            if(menor_alt > pessoa[i].getAltura()){
                menor_alt = pessoa[i].getAltura();
            }
            if (maior_alt < pessoa[i].getAltura()) {
                maior_alt = pessoa[i].getAltura();
            }

            if (pessoa[i].getGenero() == 'F') {
                som_alt_mulheres += pessoa[i].getAltura();
                cont_mulheres ++;
            }else{ cont_homens ++;}
        }

        if (cont_mulheres != 0) {
            media_alt_mulheres = som_alt_mulheres / cont_mulheres;
        }
        System.out.println();
        System.out.println("Menor altura: " + menor_alt);
        System.out.println("Maior altura: " + maior_alt);
        System.out.printf("Media das alturas das mulheres: %.2f%n", media_alt_mulheres);
        System.out.println("Número de homens: " + cont_homens);

        sc.close();
    }
}
