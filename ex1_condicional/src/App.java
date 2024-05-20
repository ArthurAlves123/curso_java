import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0){
            System.out.println("NEGATIVO");
        } else{
            System.out.println("NÃO NEGATIVO");
        }
        sc.close();
    }
}
