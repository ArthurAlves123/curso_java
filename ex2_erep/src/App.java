import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.print("Digite um valor para a coordenada X: ");
        x = sc.nextInt();
        System.out.print("Digite um valor para a coordenada Y: ");
        y = sc.nextInt();
        while (x != 0 && y != 0) {
            if(x > 0 && y > 0){
                System.out.println("Primeiro Quadrante");
            }
            else if(x > 0 && y < 0){
                System.out.println("Quarto Quadrante");
            }
            else if(x < 0 && y < 0){
                System.out.println("Terceiro Quadrante");
            }
            else{
                System.out.println("Segundo Quadrante");
            }
            System.out.print("Digite um valor para a coordenada X: ");
            x = sc.nextInt();
            System.out.print("Digite um valor para a coordenada Y: ");
            y = sc.nextInt();
        }
        System.out.println("PROGRAMA ENCERRADO");
        sc.close();
    }
}
