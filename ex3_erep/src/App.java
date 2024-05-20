import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while(x != 4){
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Álcool");
                    break;
                case 2:
                    System.out.println("Gasolina");
                    break;
                case 3:
                    System.out.println("Diesel");
                    break;
                default:
                    break;
            }
        }
        System.out.println("MUITO OBRIGADO!");
        sc.close();
    }
}
