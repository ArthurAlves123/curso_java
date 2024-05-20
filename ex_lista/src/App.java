import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();
        List<Funcionario> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Funcionário #" + (i+1));
            int id;
            do{
                System.out.print("Id: ");
                id = sc.nextInt();
                if (hasId(list, id) != null) {
                    System.out.println("Esse id já pertence a outro funcionário. ");
                }
            } while(hasId(list, id) != null);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            Funcionario emp = new Funcionario(id, nome, salario);
            list.add(emp);
        }

        System.out.print("Digite o id do funcionário que terá o salário aumentado: ");
        int id = sc.nextInt();
        Integer pos = hasId(list, id);
        if(pos == null){
            System.out.println("Funcionário não encontrado.");
        }
        else{
            System.out.print("Digite a porcentagem de aumento: ");
            double porcentagem = sc.nextDouble();
            list.get(pos).aumentoSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");

        for (Funcionario funcionario : list) {
            System.out.println(funcionario);
        }
        sc.close();
    }

    public static Integer hasId(List<Funcionario> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }
            
        }
        return null;
    }
}
